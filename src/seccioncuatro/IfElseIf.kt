package seccioncuatro

fun main(args: Array<String>){

    println("Que calificacion obtuvo en variables?")
    var caliVariables : Int = readLine()!!.toInt()

    println("Que calificacion obtuvo en operacionesMatematicas?")
    var caliOperacionMatematica : Int = readLine()!!.toInt()

    println("Que calificacion obtuvo en operadoresLogicos?")
    var caliOperadorLogico : Int = readLine()!!.toInt()

    println("Que calificacion obtuvo en condiciones?")
    var caliCondiciones : Int = readLine()!!.toInt()

    val promedio = (caliVariables +caliOperacionMatematica + caliOperadorLogico + caliCondiciones) / 4

    if (promedio == 10){
        println("Tu resultado es sobresaliente, Felicidades!!! Tu calificacion es $promedio")
    }else if (promedio == 9){
        println("Tu resultado es bueno, Tu calificacion es $promedio")
    }else if (promedio in 6..8){
        println("Tu resultado es suficiente, Tu calificacion es $promedio")
    }else{
        println("Tu resultado es insuficiente, Tu calificacion es $promedio")
    }

}