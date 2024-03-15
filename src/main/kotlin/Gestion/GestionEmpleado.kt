package org.practicatrim2.Gestion

import org.practicatrim2.Personas.Empleado

class GestionEmpleado {

private val empleados = mutableListOf<Empleado>()

    fun agregarEmpleado(nombreCompleto: String, dni: String, direccion: String, telefono: Int, contrasenia: String, sueldo: Double) {
        empleados.add(Empleado(nombreCompleto, dni, direccion, telefono, contrasenia, sueldo))
    }

    fun eliminarEmpleado(empleado: Empleado) {
        empleados.remove(empleado)
    }

    fun buscarPorDNI(dni: String): Empleado? {
        return empleados.find { it.dni == dni }
    }



    fun mostrarEmpleados() {
        return empleados.forEach { println(it) }
    }
}