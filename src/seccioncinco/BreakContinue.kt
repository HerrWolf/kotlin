package seccioncinco

fun main(args: Array<String>){

    /*for (elemento in 1..5){

        if (elemento == 3){
            break
        }
        println(elemento)
    }*/

    /*for (contador1 in 1..2){
        for (contador2 in 1..5){
            println("contador1: $contador1")
            if (contador2 == 2){
                break@loop
            }
        }
    }*/

    //con loop al llegar al breack marcado con loop se rompe todos los ciclos
    loop@for (contador1 in 1..2){
        for (contador2 in 1..5){
            println("contador1: $contador1")
            if (contador2 == 2){
                break@loop
            }
        }
    }

}