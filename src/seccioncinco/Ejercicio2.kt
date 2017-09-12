package seccioncinco

fun main(args: Array<String>){

    print("Hasta que numero quieres contar? ")
    val limiteRango = readLine()!!.toInt()

    val rango = 1..limiteRango
    var contadorPar = 0
    var contadorInpar =0

    for (elemento in rango){
        if (elemento%2 == 0){
            contadorPar++
        }else{
            contadorInpar++
        }
    }

    println("El conteo de pares es de $contadorPar y de inpares es de $contadorInpar")
}