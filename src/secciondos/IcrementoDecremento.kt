package secciondos

/*====================================================

Jerarquia de las operaciones de izquierda a derecha

1. ()
2. ++, -- (antes de la variable)
3. ^
4. *, /
5. +, -
6. %
7. =
8.++, -- (despues de la variable)

 ====================================================*/

fun main(args: Array<String>){

    var num1 = 10
    val num2 = 5

    val resultado : Int?

    resultado = num1-- + num2

    println("El resultado es $resultado")

    println("El valor de num1 es $num1")

}