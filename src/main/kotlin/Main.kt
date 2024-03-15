package org.practicatrim2

import org.practicatrim2.Gestion.GestionEmpleado
import org.practicatrim2.Menu.Menu

/**
 * Función principal que se ejecuta al iniciar la aplicación.
 */

fun main() {
    val gestionEmpleado = GestionEmpleado()
    val menu = Menu(gestionEmpleado)

/* Antes de nada, creo un empleado, suponiendo que en el concesionario ya existe uno que va a gestionar el sistema (yo).
 */

    gestionEmpleado.agregarEmpleado("Andrés Mahindo Canalo", "53586562N", "C/ Turdetania, 3 1ºD, 41008, Sevilla", 644297659, "ContraseñaDAM2024", 1500.0)


    menu.menuPrincipal()
}