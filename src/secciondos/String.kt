package secciondos

fun main(args: Array<String>){

    //los Strings son arrays de caracteres y las variables Char solo pueden almacenar un caracter y debe ir entre comillas simples

    val nombre = "Adan "
    val apellido = "Figueroa " + "Ruiz "

    println(nombre + apellido)

    val ciudad : Char = 'm'

    println("La segunda letra de nombre es " + nombre[1])

}