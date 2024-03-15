package org.practicatrim2.Gestion

import org.practicatrim2.Personas.Empleado

/**
 * Clase que gestiona los empleados
 */

class GestionEmpleado {

private val empleados = mutableListOf<Empleado>()

    /**
     * Agrega un empleado a la lista de empleados
     * @param nombreCompleto Nombre completo del empleado
     * @param dni DNI del empleado
     * @param direccion Direccion del empleado
     * @param telefono Telefono del empleado
     * @param contrasenia Contrasenia del empleado
     * @param sueldo Sueldo del empleado
     */

    fun agregarEmpleado(nombreCompleto: String, dni: String, direccion: String, telefono: Int, contrasenia: String, sueldo: Double) {
        empleados.add(Empleado(nombreCompleto, dni, direccion, telefono, contrasenia, sueldo))
    }

    /**
     * Elimina un empleado de la lista de empleados
     * @param empleado Empleado a eliminar
     */

    fun eliminarEmpleado(empleado: Empleado) {
        empleados.remove(empleado)
    }

    /**
     * Busca un empleado por su DNI
     * @param dni DNI del empleado a buscar
     * @return Empleado con el DNI especificado
     */

    fun buscarPorDNI(dni: String): Empleado? {
        return empleados.find { it.dni == dni }
    }

    /**
     * Muestra todos los empleados
     */

    fun mostrarEmpleados() {
        return empleados.forEach { println(it) }
    }
}