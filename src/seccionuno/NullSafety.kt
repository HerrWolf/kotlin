package seccionuno

fun main(args: Array<String>){

    //con el signo de interrogacion podemos recibir valores nulos
    val nombre : String?

    nombre = "Adan"

    // con el doble signo de admiracion avisamos que la variable no puede contener valores nulos
    println(nombre!!)

}