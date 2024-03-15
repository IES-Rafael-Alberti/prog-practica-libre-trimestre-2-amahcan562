package org.practicatrim2.Personas

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
        return "Nombre: $nombreCompleto, DNI: $dni, Dirección: $direccion, Teléfono: $telefono, Sueldo: $sueldo."
    }
}