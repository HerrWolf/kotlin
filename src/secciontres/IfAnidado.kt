package secciontres

fun main(args: Array<String>){

    print("Ingresa la medida en metros: ")
    val medida : Double = readLine()!!.toDouble()

    if (medida >= 1.00){
        if (medida > 5.0){
            println("La medida $medida sobrepasa los limites aceptados")
        }else{
            println("la medida $medida es aceptable")
        }
    }else{
        println("Lo siento, no es aceptable")
    }

}