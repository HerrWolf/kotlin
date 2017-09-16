package seccionsiete

fun suma(num1: Int, num2: Int):Int{

    val suma = num1 + num2

    return suma

}

fun sinParametro():Unit{

    println("Hola, soy un metodo sin parametros")

}

fun main(args: Array<String>){

    val resultado = suma(1,2)

    println(resultado)

    sinParametro()

}