package org.practicatrim2.Gestion

import org.practicatrim2.Enums.Propulsion
import org.practicatrim2.Enums.Transmision
import org.practicatrim2.Vehiculos.Autocaravana

/**
 * Clase que gestiona las autocaravanas.
 */

class GestionAutocaravana {
    private val autocaravanas = mutableListOf<Autocaravana>()

    /**
     * Agrega una autocaravana a la lista de autocaravanas.
     * @param autocaravana Autocaravana a agregar.
     */

    fun agregarAutocaravana(autocaravana: Autocaravana) {
        autocaravanas.add(autocaravana)
    }

    /**
     * Elimina una autocaravana de la lista de autocaravanas.
     * @param autocaravana Autocaravana a eliminar.
     */

    fun eliminarAutocaravana(autocaravana: Autocaravana) {
        autocaravanas.remove(autocaravana)
    }

    /**
     * Busca autocaravanas por modelo.
     * @param modelo Modelo de la autocaravana a buscar.
     * @return Lista de autocaravanas con el modelo especificado.
     */

    fun buscarPorModelo(modelo: String): List<Autocaravana> {
        return autocaravanas.filter { it.modelo == modelo }
    }

    /**
     * Muestra las autocaravanas.
     */

    fun mostrarAutocaravanas() {
        autocaravanas.forEach { println(it) }
    }

    /**
     * Convierte un string a propulsión.
     * @param input String a convertir.
     * @return Propulsión.
     */

    fun stringAPropulsion(input: String): Propulsion {
        return when (input.uppercase()) {
            "GASOLINA" -> Propulsion.GASOLINA
            "DIESEL" -> Propulsion.DIESEL
            "ELECTRICO" -> Propulsion.ELECTRICO
            "HIBRIDO" -> Propulsion.HIBRIDO
            else -> throw IllegalArgumentException("Propulsión no válida")
        }
    }

    /**
     * Convierte un string a transmisión.
     * @param input String a convertir.
     * @return Transmisión.
     */

    fun stringATransmision(input: String): Transmision {
        return when (input.uppercase()) {
            "MANUAL" -> Transmision.MANUAL
            "AUTOMATICA" -> Transmision.AUTOMATICA
            else -> throw IllegalArgumentException("Transmisión no válida")
        }
    }
}