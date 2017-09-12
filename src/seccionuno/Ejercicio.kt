package seccionuno

fun main(args: Array<String>){

    println("Escribe un numero:")

    val numero = readLine()!!.toInt()

    val perimetro = numero*4

    println("El perimetro es $perimetro")

}