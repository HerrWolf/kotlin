package seccionseis

fun main(args: Array<String>){

    val hashMap = hashMapOf(1 to "Seve", 2 to "Alondra")
    hashMap.put(50, "alo")

    println(hashMap[50])

    //las colecciones de tipo arrayOf son mutables
    val letras = arrayOf("a", "b", "c")

    letras[1] = "z"

    println(letras[1])

    //las collecciones de tipo listOf son inmutables
    val nums = listOf(0, 1, 2, -12, -24)

    for (elemento in nums){
        println(elemento)
    }

}