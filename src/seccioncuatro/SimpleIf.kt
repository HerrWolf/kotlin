package seccioncuatro

fun main(args: Array<String>){

    println("Cual es su sueldo? ")
    val sueldo: Double = readLine()!!.toDouble()

    if (sueldo > 1000){

        println("Debe de pagar impuestos!!!")

    }

}