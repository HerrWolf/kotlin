package seccionseis

fun main(args: Array<String>){

    //Convertit un listOf en una coleccion mutable
    val nums = mutableListOf(0, 1, 2, -12, -24)

    nums[2] = 4

    for (elemento in nums){
        println(elemento)
    }

    println("--------- Fin ejercicio 1 ---------")

    //setOf es de solo lectura y los elementos no se pueden repetir si se repiten no se mostrarn al imprimirlos
    val inmutable = setOf(1,2,4,0,50,50,4)

    for (elemento in inmutable){
        println(elemento)
    }

    println("--------- Fin ejercicio 2 ---------")

    //mutanblaSetOf es una coleccion de datos mutable
    val mutable = mutableSetOf(51,2,3,23)

    mutable.add(40)

    for (elemento in mutable){
        println(elemento)
    }

}