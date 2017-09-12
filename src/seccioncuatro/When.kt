package seccioncuatro

fun main(args: Array<String>){

    val x = 7

    when (x){
        1 -> {
            println(" El valor es 1")
        }
        2 -> println(" El valor es 2")
        3 -> println(" El valor es 3")
        in 5..15 -> println("El valor esta entre 5 y 15")
        !in 5..15 -> println("El valor no esta entre 5 y 15")
        else -> println(" El valor esta fuera de rango")
    }

    val promedio = 8

    when (promedio){
        10 -> println("Tu resultado es sobresaliente, Felicidades!!! Tu calificacion es $promedio")
        9 -> println("Tu resultado es bueno, Tu calificacion es $promedio")
        6,7,8 -> println("Tu resultado es suficiente, Tu calificacion es $promedio")
        //in es para trabajar con rangos
        //in 6..8 -> println("Tu resultado es suficiente, Tu calificacion es $promedio")
        else -> println("Tu resultado es insuficiente, Tu calificacion es $promedio")
    }

}