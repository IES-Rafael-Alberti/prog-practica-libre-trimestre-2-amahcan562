package org.practicatrim2.Gestion

import org.practicatrim2.Enums.Propulsion
import org.practicatrim2.Enums.Transmision
import org.practicatrim2.Vehiculos.Coche

class GestionCoche {
    private val coches = mutableListOf<Coche>()

    fun agregarCoche(coche: Coche) {
        coches.add(coche)
    }

    fun eliminarCoche(coche: Coche) {
        coches.remove(coche)
    }

    fun buscarPorModelo(modelo: String): List<Coche> {
        return coches.filter { it.modelo == modelo }
    }

    fun mostrarCoches() {
        coches.forEach { println(it) }
    }

    fun stringAPropulsion(input: String): Propulsion {
        return when (input.uppercase()) {
            "GASOLINA" -> Propulsion.GASOLINA
            "DIESEL" -> Propulsion.DIESEL
            "ELECTRICO" -> Propulsion.ELECTRICO
            "HIBRIDO" -> Propulsion.HIBRIDO
            else -> throw IllegalArgumentException("Propulsión no válida")
        }
    }

    fun stringATransmision(input: String): Transmision {
        return when (input.uppercase()) {
            "MANUAL" -> Transmision.MANUAL
            "AUTOMATICA" -> Transmision.AUTOMATICA
            else -> throw IllegalArgumentException("Transmisión no válida")
        }
    }
}