package org.practicatrim2.PackMenu

import org.practicatrim2.Gestion.GestionCoche
import org.practicatrim2.Vehiculos.Coche


class MenuCoche {
    val gestionCoche = GestionCoche()
    var continuar = true
    fun mostrarMenuCoche() {
        do {
            println(
                """
                MENÚ DE GESTIÓN DE COCHES
                
                Seleccione una opción:
                1. Añadir coche
                2. Eliminar coche
                3. Buscar coche por modelo
                4. Mostrar coches
                5. Volver al menú principal
                6. Salir
                """
            )
            print("-> ")
            val opcion = readln().toInt()
            when (opcion) {
                1 -> {
                    println("Introduzca la marca del coche:")
                    val marca = readln()
                    println("Introduzca el modelo del coche:")
                    val modelo = readln()
                    println("Introduzca el año del coche:")
                    val anio = readln().toInt()
                    println("Introduzca el precio del coche:")
                    val precio = readln().toDouble()
                    println("Introduzca el kilometraje del coche:")
                    val kilometraje = readln().toInt()
                    println("Introduzca el color del coche:")
                    val color = readln()
                    println("Introduzca la propulsión del coche:")
                    val propulsion = gestionCoche.stringAPropulsion(readln())
                    println("Introduzca la transmisión del coche:")
                    val transmision = gestionCoche.stringATransmision(readln())
                    println("Introduzca el número de puertas del coche:")
                    val numeroDePuertas = readln().toInt()
                    gestionCoche.agregarCoche(
                        Coche(
                            marca,
                            modelo,
                            anio,
                            precio,
                            kilometraje,
                            color,
                            propulsion,
                            transmision,
                            numeroDePuertas
                        )
                    )
                }

                2 -> {
                    println("Introduzca el modelo del coche a eliminar:")
                    val modelo = readln()
                    val coches = gestionCoche.buscarPorModelo(modelo)
                    if (coches.isEmpty()) {
                        println("No se encontraron coches con ese modelo")
                    } else {
                        coches.forEach { println(it) }
                        println("Introduzca el número del coche a eliminar:")
                        val numero = readln().toInt()
                        gestionCoche.eliminarCoche(coches[numero - 1])
                    }
                }

                3 -> {
                    println("Introduzca el modelo del coche a buscar:")
                    val modelo = readln()
                    val coches = gestionCoche.buscarPorModelo(modelo)
                    if (coches.isEmpty()) {
                        println("No se encontraron coches con ese modelo")
                    } else {
                        coches.forEach { println(it) }
                    }
                }

                4 -> {
                    gestionCoche.mostrarCoches()
                }

                5 -> {
                    println("Volviendo al menú principal...")
                    continuar = false
                }

                6 -> {
                    println("Saliendo del sistema...")
                    break
                }

                else -> {
                    println("Opción no válida")
                }
            }
        }while (continuar)
    }
}