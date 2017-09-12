package secciontres

fun main(args: Array<String>){

    print("Ingresar primer numero: ")

    val num1 = readLine()!!.toInt()

    print("Ingresar el segundo numero: ")

    val num2 = readLine()!!.toInt()

    print("Ingresar el tercer numero: ")

    val num3 = readLine()!!.toInt()

    print("Ingresar el cuarto numero: ")

    val num4 = readLine()!!.toInt()

    println("El resultado de la suma del primer y segundo numero es " + (num1 + num2))

    println("El producto del tercero y cuarto numero es " + (num3 * num4))

}