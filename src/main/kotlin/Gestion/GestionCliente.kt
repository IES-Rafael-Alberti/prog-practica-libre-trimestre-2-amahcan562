package org.practicatrim2.Gestion

import org.practicatrim2.Personas.Cliente

class GestionCliente{
    private val clientes = mutableListOf<Cliente>()


    fun agregarCliente(cliente: Cliente) {
        clientes.add(cliente)
    }

    fun eliminarCliente(cliente: Cliente) {
        clientes.remove(cliente)
    }

    fun buscarPorDNI(dni: String): Cliente? {
        return clientes.find { it.dni == dni }
    }

    fun mostrarClientes() {
        return clientes.forEach { println(it) }
    }

}