package seccionuno

fun main(args: Array<String>){

    println("Cual es tu nombre?")

    val nombre = readLine()

    println(nombre)

    println("cual es tu edad?")

    val edad : Int = readLine()!!.toInt()

    println(edad)

}