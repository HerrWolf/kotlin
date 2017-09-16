package seccionnueve

fun main(args: Array<String>) {

    try {
        print("Ingresa un numero: ")
        var num1 = readLine()!!.toInt()
        var division = 50 / num1

        println("la division es $division")

    }catch (e: Exception){
        println("No se pueden hacer divisiones entre cero")
    }

    println("Aplicacion finalizada")
}