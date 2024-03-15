package org.practicatrim2.Vehiculos

import org.practicatrim2.Enums.Propulsion
import org.practicatrim2.Enums.Transmision

class Furgoneta (
    marca: String,
    modelo: String,
    anio: Int,
    precio: Double,
    kilometraje: Int,
    color: String,
    propulsion: Propulsion,
    transmision: Transmision,
    val capacidadDeCarga: Double
) : Vehiculo(marca, modelo, anio, precio, kilometraje, color, propulsion, transmision
) {

    init {
        require(capacidadDeCarga > 0) { "La capacidad de carga debe ser mayor a 0" }
    }

    override fun toString(): String {
        return "Marca: $marca, modelo: $modelo, año: $anio, precio: $precio€, kilometraje: $kilometraje km, color: $color, propulsión: $propulsion, transmision: $transmision, capacidad de carga: $capacidadDeCarga kg."
    }
}