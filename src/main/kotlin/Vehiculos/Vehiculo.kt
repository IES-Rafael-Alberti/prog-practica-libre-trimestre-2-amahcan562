package org.practicatrim2.Vehiculos

import org.practicatrim2.Enums.Propulsion
import org.practicatrim2.Enums.Transmision

/**
 * Clase abstracta que representa un vehículo.
 * @param marca Marca del vehículo.
 * @param modelo Modelo del vehículo.
 * @param anio Año del vehículo.
 * @param precio Precio del vehículo.
 * @param kilometraje Kilometraje del vehículo.
 * @param color Color del vehículo.
 * @param propulsion Propulsión del vehículo.
 * @param transmision Transmisión del vehículo.
 */

abstract class Vehiculo(
    val marca: String,
    val modelo: String,
    val anio: Int,
    val precio: Double,
    val kilometraje: Int,
    val color: String,
    val propulsion: Propulsion,
    val transmision: Transmision,
) {
    init {
        require(marca.isNotBlank()) { "La marca no puede estar vacía" }
        require(modelo.isNotBlank()) { "El modelo no puede estar vacío" }
        require(anio in 1900..2024) { "Se requiere un valor correcto" }
        require(precio > 0) { "El precio debe ser mayor a 0" }
        require(kilometraje >= 0) { "El kilometraje debe ser mayor o igual a 0" }
        require(color.isNotBlank()) { "El color no puede estar vacía" }
    }



}