package secciontres

fun main(args: Array<String>){

    val nombre: String = "HerrWolf"
    val nombre2: String = "Herrwolf"

    if (nombre.equals(nombre2)){
        println("Son iguales")
    }else{
        println("No son iguales")
    }

    if (nombre == nombre2){
        println("Son iguales")
    }else{
        println("No son iguales")
    }


}