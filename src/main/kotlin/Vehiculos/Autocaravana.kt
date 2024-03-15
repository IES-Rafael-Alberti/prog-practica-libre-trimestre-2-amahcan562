package org.practicatrim2.Vehiculos

import org.practicatrim2.Enums.Propulsion
import org.practicatrim2.Enums.Transmision

class Autocaravana (
    marca: String,
    modelo: String,
    anio: Int,
    precio: Double,
    kilometraje: Int,
    color: String,
    propulsion: Propulsion,
    transmision: Transmision,
    val numeroDeCamas: Int
) : Vehiculo(marca, modelo, anio, precio, kilometraje, color, propulsion, transmision
) {

    init {
        require(numeroDeCamas in 2..6) { "El número de camas debe ser entre 2 y 6" }
    }

    override fun toString(): String {
        return "Marca: $marca, modelo: $modelo, año: $anio, precio: $precio€, kilometraje: $kilometraje km, color: $color, propulsión: $propulsion, transmision: $transmision, número de camas: $numeroDeCamas."
    }
}