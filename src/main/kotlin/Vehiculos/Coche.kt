package org.practicatrim2.Vehiculos

import org.practicatrim2.Enums.Propulsion
import org.practicatrim2.Enums.Transmision

/**
 * Clase que representa un coche.
 * @param marca Marca del coche.
 * @param modelo Modelo del coche.
 * @param anio Año del coche.
 * @param precio Precio del coche.
 * @param kilometraje Kilometraje del coche.
 * @param color Color del coche.
 * @param propulsion Propulsión del coche.
 * @param transmision Transmisión del coche.
 * @param numeroDePuertas Número de puertas que tiene el coche.
 */

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