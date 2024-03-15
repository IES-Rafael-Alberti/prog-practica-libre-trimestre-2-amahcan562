package org.practicatrim2.Gestion

import org.practicatrim2.Enums.Propulsion
import org.practicatrim2.Enums.Transmision
import org.practicatrim2.Vehiculos.Furgoneta

class GestionFurgoneta {
    private val furgonetas = mutableListOf<Furgoneta>()

    fun agregarFurgoneta(furgoneta: Furgoneta) {
        furgonetas.add(furgoneta)
    }

    fun eliminarFurgoneta(furgoneta: Furgoneta) {
        furgonetas.remove(furgoneta)
    }

    fun buscarPorModelo(modelo: String): List<Furgoneta> {
        return furgonetas.filter { it.modelo == modelo }
    }

    fun mostrarFurgonetas() {
        furgonetas.forEach { println(it) }
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