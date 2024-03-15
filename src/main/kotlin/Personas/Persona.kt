package org.practicatrim2.Personas

abstract class Persona(
    val nombreCompleto: String,
    val dni: String,
    val direccion: String,
    val telefono: Int
){
    init {
        require(nombreCompleto.isNotBlank()) { "El nombre no puede estar vacío" }
        require(dni.matches(Regex("^[0-9]{8}[A-Za-z]$"))) { "El DNI debe tener 8 números seguidos de una letra" }
        require(direccion.isNotBlank()) { "La dirección no puede estar vacía" }
        require(telefono.toString().matches(Regex("^[0-9]{9}$"))) { "El teléfono debe tener 9 números" }

    }
}