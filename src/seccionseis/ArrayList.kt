package seccionseis

fun main(args: Array<String>){

    val arrayList = ArrayList<String>()

    arrayList.add("uva")
    arrayList.add("kiwi")
    arrayList.add("pithaya")

    println("El elemento en la posicion 3 es " + arrayList[2])

    println("Todos los elementos son: ")

    for (elemento in arrayList){
        println(elemento)
    }

    println("Todos los elementos por indice son:")

    for (frutita in 0..2){
        println(arrayList[frutita])
    }

    //metodos para agregar elementos a un array de tipo string
    //metodo 1
    arrayList[1] = ("fresa")
    //metodo 2
    arrayList.set(0, "platano")

    println(arrayList)

    //como buscar coincidencias dentro de un array con la funcion .contains
    if (arrayList.contains("pithaya")){
        println("elemento encontrado")
    }else{
        println("no se ha encontrado")
    }

    // si no sabemos el tamaño de nuestro array podemos usar este metodo
    for (tamañoDesconocido in 0..arrayList.size -1){
        println(arrayList[tamañoDesconocido])
    }



}