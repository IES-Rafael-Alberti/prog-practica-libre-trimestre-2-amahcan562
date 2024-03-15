package org.practicatrim2.Vehiculos

import org.practicatrim2.Enums.Propulsion
import org.practicatrim2.Enums.Transmision

/**
 * Clase que representa una furgoneta.
 * @param marca Marca de la furgoneta.
 * @param modelo Modelo de la furgoneta.
 * @param anio Año de la furgoneta.
 * @param precio Precio de la furgoneta.
 * @param kilometraje Kilometraje de la furgoneta.
 * @param color Color de la furgoneta.
 * @param propulsion Propulsión de la furgoneta.
 * @param transmision Transmisión de la furgoneta.
 * @param capacidadDeCarga Capacidad de carga de la furgoneta.
 */

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