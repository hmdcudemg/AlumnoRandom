package Alumno.Random.Kotlin

import java.util.*

/**
 * Created by DEMG on 25/02/2017.
 */
fun main(args: Array<String>) {
    alumnoAleatorio()
}

fun alumnoAleatorio() {
    val rnd = Random()
    val snd = Scanner(System.`in`)

    println("Introduce el número de Alumnos?")
    var numAlumnos = snd.nextInt()

    var opc = 0
    do {
        println("1.-Generar número Aleatorio\n0.-Presiona para terminar")
        opc = snd.nextInt()

        if (opc == 1) {
            println("\nNúmero aleatorio= ${rnd.nextInt(numAlumnos) + 1} \n")
        }
    } while (opc != 0)
}