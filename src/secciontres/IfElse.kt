package secciontres

fun main(args: Array<String>){

    val num1 : Int = 5
    val num2 : Int = 19

    var resultado : Int?

    if (num1 > num2)
        resultado = num1
    else
        resultado = num2

    println(resultado)

    //esta estructura funciona igual que la anterior esto se conoce como una expresion la cual retorna un resultado la cual debemos guardar en una variable
    resultado = if (num1 > num2) num1 else num2
    println(resultado)


}