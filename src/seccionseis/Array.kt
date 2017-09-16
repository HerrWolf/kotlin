package seccionseis

fun main(args: Array<String>){

    val arrayUno = Array<Int>(5){0}

    arrayUno[1] = 5
    arrayUno[2] = -15
    arrayUno[3] = 50
    arrayUno[4] = 100

    println("Array en la posicion 3 es " + arrayUno[3])

    for (elemento in arrayUno){
        println(elemento)
    }

    println("Termino la busqueda de valores por objeto")

    for (indice in 0..4){
        println(arrayUno[indice])
    }

    println("Termino la busqueda de valores por indice")

    val fruta = Array<String>(2){""}

    for (indice in 0..1){
        print("ingresa la fruta del indice [$indice]: ")
        fruta[indice] = readLine()!!
    }

    for (indice in 0..1){
        println("La fruta en el indice [$indice] es: "+ fruta[indice])
    }

}