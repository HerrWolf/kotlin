package seccioncuatro

fun main(args: Array<String>){

    print("Hazme una pregunta: ")
    val pregunta = readLine()
    val base : String = "el menny es puto?"

    if (pregunta == base){
        println("Si, el menny se la come entera")
    }else{
        println("No se, yo solo se que el menny se la come enterita")
    }

}