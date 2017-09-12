package seccioncinco

fun main(args: Array<String>){

    val rango = 1..400

    for (i in rango){
        if (i%8 == 0){
            println(i)
        }
    }
}