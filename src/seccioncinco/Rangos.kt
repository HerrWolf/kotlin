package seccioncinco

fun main(args: Array<String>){

    val nums = 1..50

    for (elemento in nums){
        println(elemento)
    }

    println("----------------------------")

    for (elemento in nums step 2){
        println(elemento)
    }

    println("----------------------------")

    for (elemento in nums.reversed()){
        println(elemento)
    }

    val nums2 = 15 downTo 1

    for (elemento in nums2){
        println(elemento)
    }

    for (elemento in 1 until 16){
        println(elemento)
    }

    for (elemento in nums2){
        println("El conteo es de ${nums2.count()} elementos")
    }

    var chars = 'A'..'z'

    for (elemento in chars){
        println(elemento)
    }

}