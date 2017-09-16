package seccionseis

fun main(args: Array<String>){

    val array1 = Array<Int>(4){0}
    val array2 = Array<Int>(4){0}
    val array3 = Array<Int>(4){0}

    println("---------- PRIMER ARRAY ----------")
    for (i in 0..3){
        print("Ingresa un numero para el indice [$i] del primer Array: ")
        array1[i] = readLine()!!.toInt()
    }

    println("---------- SEGUNDO ARRAY ----------")

    for (i in 0..3){
        print("Ingresa un numero para el indice [$i] del segundo Array: ")
        array2[i] = readLine()!!.toInt()
    }

    for (i in 0..3){
        array3[i] = array1[i] + array2[i]
    }

    println("---------- RESULTADO ----------")

    print("Los valores en el Array 1 son: ")
    for (i in array1){
        print("$i ")
    }

    print("\n")

    print("Los valores en el Array 2 son: ")
    for (i in array2){
        print("$i ")
    }

    print("\n")

    print("Los resultados son: ")
    for (i in array3){
        print("$i ")
    }

    print("\n")

    println("---------- FINAL ----------")
}