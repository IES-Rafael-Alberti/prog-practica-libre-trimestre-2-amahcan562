package org.practicatrim2.PackMenu

import org.practicatrim2.Gestion.GestionAutocaravana
import org.practicatrim2.Vehiculos.Autocaravana

/**
 * Clase que representa el menú de gestión de autocaravanas
 */

class MenuAutocaravana {
    val gestionAutocaravana = GestionAutocaravana()
    var continuar = true

    /**
     * Función que muestra el menú de gestión de autocaravanas
     */

    fun mostrarMenuAutocaravana() {
        do {
            println(
                """
                MENÚ DE GESTIÓN DE AUTOCARAVANAS
                
                Seleccione una opción:
                1. Añadir autocaravana
                2. Eliminar autocaravana
                3. Buscar autocaravana por modelo
                4. Mostrar autocaravanas
                5. Volver al menú de selección de tipo de vehículo
                6. Salir
                """
            )
            print("-> ")
            val opcion = readln().toInt()
            when (opcion) {
                1 -> {
                    println("Introduzca la marca de la autocaravana:")
                    val marca = readln()
                    println("Introduzca el modelo de la autocaravana:")
                    val modelo = readln()
                    println("Introduzca el año de la autocaravana:")
                    val anio = readln().toInt()
                    println("Introduzca el precio de la autocaravana:")
                    val precio = readln().toDouble()
                    println("Introduzca el kilometraje de la autocaravana:")
                    val kilometraje = readln().toInt()
                    println("Introduzca el color de la autocaravana:")
                    val color = readln()
                    println("Introduzca la propulsión de la autocaravana:")
                    val propulsion = gestionAutocaravana.stringAPropulsion(readln())
                    println("Introduzca la transmisión de la autocaravana:")
                    val transmision = gestionAutocaravana.stringATransmision(readln())
                    println("Introduzca el número de camas de la autocaravana:")
                    val numeroDeCamas = readln().toInt()
                    gestionAutocaravana.agregarAutocaravana(
                        Autocaravana(
                            marca,
                            modelo,
                            anio,
                            precio,
                            kilometraje,
                            color,
                            propulsion,
                            transmision,
                            numeroDeCamas
                        )
                    )
                    println("Autocaravana añadida correctamente.")
                }
                2 -> {
                    println("Introduzca el modelo de la autocaravana a eliminar:")
                    val modelo = readln()
                    val autocaravana = gestionAutocaravana.buscarPorModelo(modelo)
                    if (autocaravana.isEmpty()) {
                        println("No se encontró ninguna autocaravana con ese modelo")
                    } else {
                        autocaravana.forEach { println(it) }
                        println("Introduzca el número de la autocaravana a eliminar:")
                        val numero = readln().toInt()
                        gestionAutocaravana.eliminarAutocaravana(autocaravana[numero - 1])
                    }
                }
                3 -> {
                    println("Introduzca el modelo de la autocaravana a buscar:")
                    val modelo = readln()
                    val autocaravana = gestionAutocaravana.buscarPorModelo(modelo)
                    if (autocaravana.isEmpty()) {
                        println("No se encontró ninguna autocaravana con ese modelo")
                    } else {
                        autocaravana.forEach { println(it) }
                    }
                }
                4 -> {
                    gestionAutocaravana.mostrarAutocaravanas()
                }
                5 -> {
                    println("Volviendo al menú de selección de tipo de vehículo...")
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
}