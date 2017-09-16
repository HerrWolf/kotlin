package seccionseis

fun main(args: Array<String>){

    //los HashMap reciben 2 parametros la llave o key y el valor o value y pueden ser Int o String
    val hashMap = HashMap<Int, String>()

    //para agregar datos a un HashMap usamos el metodo put
    hashMap.put(1, "Merida")
    hashMap.put(200, "Villahermosa")
    hashMap.put(0, "Izmal")
    hashMap.put(50, "Ensenada")

    //mostrar elementos del HashMap
    println(hashMap[50])
    println("--------- Fin del ejercicio 1 ----------")

    //actualizar datos en un HashMap
    hashMap.put(50, "Tijuana")

    //mostrar todos los elementos de un HashMap
    for (key in hashMap.keys){
        println(hashMap[key])
    }

}