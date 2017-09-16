package seccionocho

class Numeros<T>(numero: T){

    init{
        println(numero)
    }

}

fun <T> imprimir(texto:T){
    println(texto)
}

fun main(args: Array<String>){

    var num1 = Numeros<Int>(23)
    var num2 = Numeros<Double>(23.546)
    var num3 = Numeros<Float>(23.12f)
    var text1 = Numeros<String>("Esto es una clase generica")

    println("---------- FIN ----------")

    imprimir<Int>(22)
    imprimir<String>("Esto es una funcion generica")


}