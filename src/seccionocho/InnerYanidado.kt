package seccionocho

class Externa{

    private val nombre: String? = null

    //Para acceder a variables privadas dentro de nuestra clase padre usamos la palabra reservada inner
    class Anidada{

        fun mostrar() {
            println("hola")
        }

    }

}

fun main(args: Array<String>) {

    var externa = Externa()
    //Para aceder a una clase anidada debemos hacer referencia a la clase padre en este caso la clase Externa()
    var anidada = Externa.Anidada()

    //Aqui llamamos la funcion mostrar que esta en la clase Anidada dentro de la clase Externa
    anidada.mostrar()

}