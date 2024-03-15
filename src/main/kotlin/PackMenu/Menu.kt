package org.practicatrim2.Menu

import org.practicatrim2.Gestion.GestionCliente
import org.practicatrim2.Gestion.GestionEmpleado
import org.practicatrim2.PackMenu.MenuAutocaravana
import org.practicatrim2.PackMenu.MenuCoche
import org.practicatrim2.PackMenu.MenuFurgoneta
import org.practicatrim2.Personas.Cliente

/**
 * La clase Menu se utiliza para manejar la interacción del usuario con el sistema de gestión del concesionario.
 * @property gestionEmpleado Una instancia de la clase GestionEmpleado que se utiliza para realizar operaciones relacionadas con los empleados.
 */
class Menu (private val gestionEmpleado : GestionEmpleado){

    /**
     * Muestra el menú principal del sistema de gestión del concesionario.
     */

    fun menuPrincipal(){
        do {
            println(
                """
                SISTEMA DE GESTIÓN DEL CONCESIONARIO.    
                    
                Seleccione una opción:
                1. Identificarse como empleado
                2. Salir
                """
            )
            print("-> ")
            val opcion = readln().toInt()

            when (opcion) {
                1 -> {
                    do {
                        println("Introduzca su DNI:")
                        val dni = readln()
                        val empleado = gestionEmpleado.buscarPorDNI(dni)
                        if ( empleado != null && empleado.dni == dni) {
                            println("Introduzca su contraseña:")
                            val contrasenia = readln()

                            if (empleado.contrasenia == contrasenia) {
                                println("Bienvenido, ${empleado.nombreCompleto}")
                                menuEmpleado()
                                break
                            } else {
                                println("Contraseña incorrecta, por favor intente de nuevo.")
                            }
                        } else {
                            println("DNI no encontrado, por favor intente de nuevo.")
                        }
                    } while (true)
                }
                2 -> {
                    println("Saliendo del sistema...")
                    break
                }
                else -> {
                    println("Opción inválida")
                }
            }
        }while (true)
    }

    /**
     * Muestra el menú de empleado, que permite al empleado gestionar clientes, vehículos y otros empleados.
     */

    fun menuEmpleado(){
        var continuar = true
        do {
            println(
                """
                MENÚ DE EMPLEADO
                
                Seleccione una opción:
                1. Gestionar clientes
                2. Gestionar vehículos
                3. Gestionar empleados
                4. Menú principal
                5. Salir
                """
            )
            print("-> ")
            val opcion = readln().toInt()

            when (opcion) {
                1 -> {
                    menuGestionClientes()
                }
                2 -> {
                    menuGestionStock()
                }
                3 -> {
                    menuGestionEmpleados()
                }
                4 -> {
                    println("Volviendo al menú principal...")
                    continuar = false
                }
                5 -> {
                    println("Saliendo del sistema...")
                    break
                }
                else -> {
                    println("Opción inválida")
                }
            }
        }while (continuar)
    }

    /**
     * Muestra el menú de gestión de clientes, que permite al empleado realizar operaciones relacionadas con los clientes.
     */

    fun menuGestionClientes(){
        val gestionCliente = GestionCliente()
        var continuar = true
        do {
            println(
                """
                MENÚ DE GESTIÓN DE CLIENTES
                
                Seleccione una opción:
                1. Añadir cliente
                2. Eliminar cliente
                3. Buscar cliente
                4. Mostrar clientes
                5. Menú de empleado
                6. Salir
                """
            )
            print("-> ")
            val opcion = readln().toInt()

            when (opcion) {
                1 -> {
                    println("Introduzca el nombre completo del cliente:")
                    val nombreCompleto = readln()
                    println("Introduzca el DNI del cliente:")
                    val dni = readln()
                    println("Introduzca la dirección del cliente:")
                    val direccion = readln()
                    println("Introduzca el teléfono del cliente:")
                    val telefono = readln().toInt()
                    println("Introduzca el interés del cliente:")
                    val interes = readln()
                    gestionCliente.agregarCliente(Cliente(nombreCompleto, dni, direccion, telefono, interes))
                    println("Cliente añadido correctamente.")
                }
                2 -> {
                    println("Introduzca el DNI del cliente a eliminar:")
                    val dni = readln()
                    val cliente = gestionCliente.buscarPorDNI(dni)
                    if (cliente != null) {
                        gestionCliente.eliminarCliente(cliente)
                        println("Cliente eliminado correctamente.")
                    } else {
                        println("Cliente no encontrado.")
                    }
                }
                3 -> {
                    println("Introduzca el DNI del cliente a buscar:")
                    val dni = readln()
                    val cliente = gestionCliente.buscarPorDNI(dni)
                    if (cliente != null) {
                        println(cliente)
                    } else {
                        println("Cliente no encontrado.")
                    }
                }
                4 -> {
                    gestionCliente.mostrarClientes()
                }
                5 -> {
                    println("Volviendo al menú de empleado...")
                    continuar = false
                }

                6 -> {
                    println("Saliendo del sistema...")
                    break
                }

                else -> {
                    println("Opción inválida")
                }

            }
        } while (continuar)
    }

    /**
     * Muestra el menú de gestión de empleados, que permite al empleado realizar operaciones relacionadas con otros empleados.
     */

    fun menuGestionEmpleados(){
        var continuar = true
        do {
            println(
                """
                MENÚ DE GESTIÓN DE EMPLEADOS
                
                Seleccione una opción:
                1. Añadir empleado
                2. Eliminar empleado
                3. Buscar empleado
                4. Mostrar empleados
                5. Menú de empleado
                6. Salir
                """
            )
            print("-> ")
            val opcion = readln().toInt()

            when (opcion) {
                1 -> {
                    println("Introduzca el nombre completo del empleado:")
                    val nombreCompleto = readln()
                    println("Introduzca el DNI del empleado:")
                    val dni = readln()
                    println("Introduzca la dirección del empleado:")
                    val direccion = readln()
                    println("Introduzca el teléfono del empleado:")
                    val telefono = readln().toInt()
                    println("Introduzca el sueldo del empleado:")
                    val sueldo = readln().toDouble()
                    println("Introduzca la contraseña del empleado:")
                    val contrasenia = readln()
                    gestionEmpleado.agregarEmpleado(nombreCompleto, dni, direccion, telefono, contrasenia, sueldo)
                    println("Empleado añadido correctamente.")
                }
                2 -> {
                    println("Introduzca el DNI del empleado a eliminar:")
                    val dni = readln()
                    val empleado = gestionEmpleado.buscarPorDNI(dni)
                    if (empleado != null) {
                        gestionEmpleado.eliminarEmpleado(empleado)
                        println("Empleado eliminado correctamente.")
                    } else {
                        println("Empleado no encontrado.")
                    }
                }
                3 -> {
                    println("Introduzca el DNI del empleado a buscar:")
                    val dni = readln()
                    val empleado = gestionEmpleado.buscarPorDNI(dni)
                    if (empleado != null) {
                        println(empleado)
                    } else {
                        println("Empleado no encontrado.")
                    }
                }
                4 -> {
                    gestionEmpleado.mostrarEmpleados()
                }
                5 -> {
                    println("Volviendo al menú de empleado...")
                    continuar = false
                }
                6 -> {
                    println("Saliendo del sistema...")
                    break
                }
                else -> {
                    println("Opción inválida")
                }
            }
    }while (continuar)
    }

    /**
     * Muestra el menú de gestión de stock, que permite al empleado gestionar diferentes tipos de vehículos.
     */

    fun menuGestionStock(){
        var continuar = true
        do {
            println("""
            ¿Con qué tipo de vehículo desea trabajar?
            1. Coche
            2. Autocaravana
            3. Furgoneta
            4. Volver al menú de empleado
            5. Salir
        """)
            print("-> ")
            val opcion = readln().toInt()

            when (opcion) {
                1 -> {
                    MenuCoche().mostrarMenuCoche()
                }
                2 -> {
                    MenuAutocaravana().mostrarMenuAutocaravana()
                }
                3 -> {
                    MenuFurgoneta().mostrarMenuFurgoneta()
                }
                4 -> {
                    println("Volviendo al menú de empleado...")
                    continuar = false
                }
                5 -> {
                    println("Saliendo del sistema...")
                    break
                }
                else -> {
                    println("Opción inválida")
                }
            }
        } while (continuar)
    }
    }