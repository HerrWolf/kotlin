package secciontres

fun main(args: Array<String>){

    print("Ingresa el primer numero: ")
    val num1 : Int = readLine()!!.toInt()

    print("Ingresa el segundo numero: ")
    val num2 : Int = readLine()!!.toInt()

    val resultado = num1 / num2

    println("El resultado es $resultado")

}