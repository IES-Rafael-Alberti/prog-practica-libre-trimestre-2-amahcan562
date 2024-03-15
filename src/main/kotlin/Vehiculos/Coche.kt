package org.practicatrim2.Vehiculos

import org.practicatrim2.Enums.Propulsion
import org.practicatrim2.Enums.Transmision

class Coche (
    marca: String,
    modelo: String,
    anio: Int,
    precio: Double,
    kilometraje: Int,
    color: String,
    propulsion: Propulsion,
    transmision: Transmision,
    val numeroDePuertas: Int
) : Vehiculo(marca, modelo, anio, precio, kilometraje, color, propulsion, transmision
) {
    init {
        require(numeroDePuertas in 3..5) { "El número de puertas debe ser entre 3 y 5" }
    }

    override fun toString(): String {
        return "Marca: $marca, modelo: $modelo, año: $anio, precio: $precio€, kilometraje: $kilometraje km, color: $color, propulsión: $propulsion, transmision: $transmision, número de puertas: $numeroDePuertas."
    }
}