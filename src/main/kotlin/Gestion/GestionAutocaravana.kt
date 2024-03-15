package org.practicatrim2.Gestion

import org.practicatrim2.Enums.Propulsion
import org.practicatrim2.Enums.Transmision
import org.practicatrim2.Vehiculos.Autocaravana

class GestionAutocaravana {
    private val autocaravanas = mutableListOf<Autocaravana>()

    fun agregarAutocaravana(autocaravana: Autocaravana) {
        autocaravanas.add(autocaravana)
    }

    fun eliminarAutocaravana(autocaravana: Autocaravana) {
        autocaravanas.remove(autocaravana)
    }

    fun buscarPorModelo(modelo: String): List<Autocaravana> {
        return autocaravanas.filter { it.modelo == modelo }
    }

    fun mostrarAutocaravanas() {
        autocaravanas.forEach { println(it) }
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