package org.practicatrim2.Personas

class Cliente(
    nombreCompleto: String,
    dni: String,
    direccion: String,
    telefono: Int,
    val interes: String
) : Persona(nombreCompleto, dni, direccion, telefono) {

    init {
        require(interes.isNotBlank()) { "El interés no puede estar vacío" }
    }

    override fun toString(): String {
        return "Nombre: $nombreCompleto, DNI: $dni, Dirección: $direccion, Teléfono: $telefono, Interés: $interes."
    }
}