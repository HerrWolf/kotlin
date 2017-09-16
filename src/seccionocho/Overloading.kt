package seccionocho

//escribimos la palabra open para permitir heredar las funciones a la clase Perro
open class Human(){

    var palabra : String? = null

    //debemos escribir open para abrir la funcion que se va a sobreescribir
    open fun saludo(){
        println("Hola a todos")
    }
}

class Dog() : Human(){

    //para sobreescribir la funcion saludo escribimos la palabra override
    override fun saludo(){
        println("Soy un perro, Hola a todos")
    }

    fun ladrido(){
        println("Guauuu, guaaaff")
    }

}


fun main(args: Array<String>) {

    var persona = Human()
    var juanito = persona.saludo()

    var perrito = Dog()
    var coco = perrito.saludo()


}