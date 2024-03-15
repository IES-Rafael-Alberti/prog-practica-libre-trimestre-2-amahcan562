package org.practicatrim2.Gestion

import org.practicatrim2.Personas.Cliente

/**
 * Clase que gestiona los clientes
 */

class GestionCliente{
    private val clientes = mutableListOf<Cliente>()

    /**
     * Agrega un cliente a la lista de clientes
     * @param cliente Cliente a agregar
     */

    fun agregarCliente(cliente: Cliente) {
        clientes.add(cliente)
    }

    /**
     * Elimina un cliente de la lista de clientes
     * @param cliente Cliente a eliminar
     */

    fun eliminarCliente(cliente: Cliente) {
        clientes.remove(cliente)
    }

    /**
     * Busca un cliente por su DNI
     * @param dni DNI del cliente a buscar
     * @return Cliente encontrado
     */

    fun buscarPorDNI(dni: String): Cliente? {
        return clientes.find { it.dni == dni }
    }

    /**
     * Muestra todos los clientes
     */

    fun mostrarClientes() {
        return clientes.forEach { println(it) }
    }

}