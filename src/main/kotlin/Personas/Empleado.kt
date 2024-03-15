package org.practicatrim2.Personas

/**
 * Clase que representa a un empleado.
 * @param nombreCompleto Nombre completo del empleado.
 * @param dni DNI del empleado.
 * @param direccion Dirección del empleado.
 * @param telefono Teléfono del empleado.
 * @param contrasenia Contraseña del empleado.
 * @param sueldo Sueldo del empleado.
 */

class Empleado (
    nombreCompleto: String,
    dni: String,
    direccion: String,
    telefono: Int,
    val contrasenia: String,
    private val sueldo: Double
) : Persona(nombreCompleto, dni, direccion, telefono
){
    init {
        require(contrasenia.isNotBlank()) { "La contraseña no puede estar vacía" }
        require(sueldo > 1134.0) { "El sueldo debe ser mayor a 1.134€" }
    }

    override fun toString(): String {
        return "Nombre: $nombreCompleto, DNI: $dni, Dirección: $direccion, Teléfono: $telefono, Sueldo: $sueldo.€"
    }
}