package seccioncuatro

fun main(args: Array<String>){

    print("Ingresa un numero: ")
    val num1 : Int = readLine()!!.toInt()

    print("Ingresa otro numero: ")
    val num2 : Int = readLine()!!.toInt()

    if (num1 > num2){
        val suma = num1 + num2
        val diferencia = num1 - (suma - num1)
        println("La suma de ambos numeros es $suma y la diferencia es de $diferencia")
    }else{
        val producto = num1 * num2
        val division : Float = num1.toFloat() / num2.toFloat()

        println("EL producto de ambos numeros es $producto y la division es $division")
    }

}