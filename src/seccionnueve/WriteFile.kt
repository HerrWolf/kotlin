package seccionnueve

import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {

    println("Opcion 1: Leer\nOpcion 2: Escribir")
    var opcion = readLine()!!.toInt()

    when (opcion) {
        1-> {leerArchivo()}
        2-> {
            print("Escribe tu texto: ")
            var texto: String = readLine()!!.toString()
            escribirArchivo(texto)
        }
    }
}

fun escribirArchivo(texto: String) {

    try {

        var archivo = FileWriter("prueba.txt", true)
        archivo.write(texto + "\n")
        archivo.close()
        println("Se ha guardado correctamente")

    } catch (ex: Exception) {

        println(ex.message)

    }


}

fun leerArchivo() {

    try {

        var leer = FileReader("prueba.txt")
        var caracter: Int?

        do {

            caracter = leer.read()
            print(caracter.toChar())

        } while (caracter != -1)

    } catch (ex: Exception) {

        println(ex.message)

    }
}