package org.practicatrim2.Gestion

import org.practicatrim2.Enums.Propulsion
import org.practicatrim2.Enums.Transmision
import org.practicatrim2.Vehiculos.Furgoneta

/**
 * Clase que gestiona las furgonetas
 */

class GestionFurgoneta {
    private val furgonetas = mutableListOf<Furgoneta>()

    /**
     * Añade una furgoneta a la lista de furgonetas
     * @param furgoneta furgoneta a añadir
     */

    fun agregarFurgoneta(furgoneta: Furgoneta) {
        furgonetas.add(furgoneta)
    }

    /**
     * Elimina una furgoneta de la lista de furgonetas
     * @param furgoneta furgoneta a eliminar
     */

    fun eliminarFurgoneta(furgoneta: Furgoneta) {
        furgonetas.remove(furgoneta)
    }

    /**
     * Busca furgonetas por modelo
     * @param modelo modelo de la furgoneta a buscar
     * @return lista de furgonetas con el modelo especificado
     */

    fun buscarPorModelo(modelo: String): List<Furgoneta> {
        return furgonetas.filter { it.modelo == modelo }
    }

    /**
     * Muestra todas las furgonetas
     */

    fun mostrarFurgonetas() {
        furgonetas.forEach { println(it) }
    }

    /**
     * Convierte un string a propulsión
     * @param input string a convertir
     * @return propulsión
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
     * Convierte un string a transmisión
     * @param input string a convertir
     * @return transmisión
     */

    fun stringATransmision(input: String): Transmision {
        return when (input.uppercase()) {
            "MANUAL" -> Transmision.MANUAL
            "AUTOMATICA" -> Transmision.AUTOMATICA
            else -> throw IllegalArgumentException("Transmisión no válida")
        }
    }
}