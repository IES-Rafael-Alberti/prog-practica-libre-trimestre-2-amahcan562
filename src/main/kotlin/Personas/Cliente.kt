package org.practicatrim2.Personas

/**
 * Clase que representa a un cliente.
 * @param nombreCompleto Nombre completo del cliente.
 * @param dni DNI del cliente.
 * @param direccion Dirección del cliente.
 * @param telefono Teléfono del cliente.
 * @param interes Interés del cliente.
 */

class Cliente(
    nombreCompleto: String,
    dni: String,
    direccion: String,
    telefono: Int,
    private val interes: String
) : Persona(nombreCompleto, dni, direccion, telefono) {


    init {
        require(interes.isNotBlank()) { "El interés no puede estar vacío" }
    }


    override fun toString(): String {
        return "Nombre: $nombreCompleto, DNI: $dni, Dirección: $direccion, Teléfono: $telefono, Interés: $interes."
    }
}