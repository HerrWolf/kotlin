package seccionsiete

fun poliformismo(num1:Int):Unit{

    println("El numero es $num1")
    println("---------- FIN ----------")

}

fun poliformismo(num1:Double):Unit{

    println("El numero es $num1")
    println("---------- FIN ----------")

}

fun poliformismo(num1:Float):Unit{

    println("El numero es $num1")
    println("---------- FIN ----------")

}

fun poliformismo(nombre:String):Unit{

    println("El nombre es $nombre")
    println("---------- FIN ----------")

}

fun main(args: Array<String>){

    poliformismo(12589)
    poliformismo(123.654987)
    poliformismo(12.654f)
    poliformismo("herrwolf")

}