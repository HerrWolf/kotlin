package seccionsiete

fun main(args: Array<String>){

    val resultado = sumar(3,9)
    println(resultado)

    println("---------- FIN ----------")

    val result = summa(5,8)
    println(result)

    println("---------- FIN ----------")

    val maximo = maxim(10,19)
    println(maximo)

    println("---------- FIN ----------")

    val maxim = maxx(12,11)
    println(maxim)

    println("---------- FIN ----------")

}

//Funcion normal
fun sumar(a: Int, b: Int): Int{
    return a+b
}

//Funcion inline
fun summa(a:Int, b:Int):Int = a+b

//funcion normal
fun maxim(num1:Int, num2:Int):Int{
    if (num1 > num2){
        return num1
    }else{
        return num2
    }
}

//funcion inline
fun maxx(num1:Int, num2: Int):Int = if (num1>num2) num1 else num2