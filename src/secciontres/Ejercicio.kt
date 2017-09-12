package secciontres

fun main(args: Array<String>){

    println("Ingresa la cantidad de productos: ")

    val cantidadProductos = readLine()!!.toInt()

    println("Ingresa el precio unitario: ")

    val precioUnitario = readLine()!!.toInt()

    println("El total a pagar es: " + (cantidadProductos * precioUnitario))

}