package org.practicatrim2.Gestion

import org.practicatrim2.Enums.Propulsion
import org.practicatrim2.Enums.Transmision
import org.practicatrim2.Vehiculos.Coche

/**
 * Clase que gestiona los coches.
 */

class GestionCoche {
    private val coches = mutableListOf<Coche>()

    /**
     * Agrega un coche a la lista de coches.
     * @param coche Coche a agregar.
     */

    fun agregarCoche(coche: Coche) {
        coches.add(coche)
    }

    /**
     * Elimina un coche de la lista de coches.
     * @param coche Coche a eliminar.
     */

    fun eliminarCoche(coche: Coche) {
        coches.remove(coche)
    }

    /**
     * Busca coches por modelo.
     * @param modelo Modelo a buscar.
     * @return Lista de coches con el modelo especificado.
     */

    fun buscarPorModelo(modelo: String): List<Coche> {
        return coches.filter { it.modelo == modelo }
    }

    /**
     * Muestra todos los coches.
     */

    fun mostrarCoches() {
        coches.forEach { println(it) }
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