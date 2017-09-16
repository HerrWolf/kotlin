package seccionocho

//escribimos la palabra open para permitir heredar las funciones a la clase Perro
open class Humano(){
    /*
    con el modificador protected podemos ver la variable pero no podemos hacer una instancia
    con el modificador private solo tenemos acceso a la variable dentro de la misma clase ni estando heredada la clase
    */
    var palabra : String? = null

    fun saludo(){
        println("Hola a todos")
    }
}

//agregamos la clase Humano despues de los : para heredad sus funciones a la clase Perro "SOLO SE PUEDE HEREDAR UNA CLASE A LA VEZ"
class Perro() : Humano(){

    fun ladrido(){
        println("Guauuu, guaaaff")
    }

    // con super podemos acceder a variables que estan declaradas en  otras clases ya que por defecto las variables en kotlin son publicas
    fun getPalabra(){
        super.palabra
    }

}

class Gato(){

    fun maullido(){
        println("Miauuuuuu")
    }
}


fun main(args: Array<String>) {

    var persona = Humano()
    var juanito = persona.saludo()

    var perrito = Perro()
    var coco = perrito.saludo()

    println(persona.palabra)

}