package seccionuno

fun main(args: Array<String>){
    /* las variables de tipo float solo almacenan 7 decimanles mientras las variables de tipo double almacenan el doble que los float*/
    var doble : Double = 3.141592653589793
    var flotante : Float = 3.141592653589793f

    println(doble)
    println(flotante)

    var x : Int = 2
    var y : Int = 8
    x = 9
    var z : Int = x + y

    println("El valor de z es " + z)

    var nombre : String = "HerrWolf"
    var edad : Int = 33
    var ciudad = "Ensenada"

    println("Mi nombre es $nombre, mi edad es $edad y vivo en $ciudad")

}