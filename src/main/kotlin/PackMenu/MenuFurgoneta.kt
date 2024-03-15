package org.practicatrim2.PackMenu

import org.practicatrim2.Gestion.GestionFurgoneta
import org.practicatrim2.Vehiculos.Furgoneta

/**
 * Clase que representa el menú de gestión de furgonetas
 */

class MenuFurgoneta {
    val gestionFurgoneta = GestionFurgoneta()
    var continuar = true

    /**
     * Función que muestra el menú de gestión de furgonetas
     */

    fun mostrarMenuFurgoneta() {
        do {
            println(
                """
                MENÚ DE GESTIÓN DE FURGONETAS
                
                Seleccione una opción:
                1. Añadir furgoneta
                2. Eliminar furgoneta
                3. Buscar furgoneta por modelo
                4. Mostrar furgonetas
                5. Volver al menú de selección de tipo de vehículo
                6. Salir
                """
            )
            print("-> ")
            val opcion = readln().toInt()
            when (opcion) {
                1 -> {
                    println("Introduzca la marca de la furgoneta:")
                    val marca = readln()
                    println("Introduzca el modelo de la furgoneta:")
                    val modelo = readln()
                    println("Introduzca el año de la furgoneta:")
                    val anio = readln().toInt()
                    println("Introduzca el precio de la furgoneta:")
                    val precio = readln().toDouble()
                    println("Introduzca el kilometraje de la furgoneta:")
                    val kilometraje = readln().toInt()
                    println("Introduzca el color de la furgoneta:")
                    val color = readln()
                    println("Introduzca la propulsión de la furgoneta:")
                    val propulsion = gestionFurgoneta.stringAPropulsion(readln())
                    println("Introduzca la transmisión de la furgoneta:")
                    val transmision = gestionFurgoneta.stringATransmision(readln())
                    println("Introduzca el volumen de carga de la furgoneta:")
                    val capacidadDeCarga = readln().toDouble()
                    gestionFurgoneta.agregarFurgoneta(
                        Furgoneta(
                            marca,
                            modelo,
                            anio,
                            precio,
                            kilometraje,
                            color,
                            propulsion,
                            transmision,
                            capacidadDeCarga
                        )
                    )
                    println("Furgoneta añadida correctamente.")
                }
                2 -> {
                    println("Introduzca el modelo de la furgoneta a eliminar:")
                    val modelo = readln()
                    val furgonetas = gestionFurgoneta.buscarPorModelo(modelo)
                    if (furgonetas.isEmpty()) {
                        println("No se encontraron coches con ese modelo")
                    } else {
                        furgonetas.forEach { println(it) }
                        println("Introduzca el número del coche a eliminar:")
                        val numero = readln().toInt()
                        gestionFurgoneta.eliminarFurgoneta(furgonetas[numero - 1])
                        println("Furgoneta eliminada correctamente.")
                    }
                }
                3 -> {
                    println("Introduzca el modelo de la furgoneta a buscar:")
                    val modelo = readln()
                    val furgonetas = gestionFurgoneta.buscarPorModelo(modelo)
                    if (furgonetas.isEmpty()) {
                        println("No se encontraron furgonetas con ese modelo")
                    } else {
                        furgonetas.forEach { println(it) }
                    }
                }
                4 -> {
                    gestionFurgoneta.mostrarFurgonetas()
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