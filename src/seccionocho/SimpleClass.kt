package seccionocho

//Clase
class Persona(nombre:String, edad:Int, altura: Double, peso: Double, colorOjos: String, genero: String){

    //Variables que se llenaran con los valores que traiga nuestra clase (las propiedades de la clase Persona)
    var nombre:String? = null
    var edad:Int? = null
    var altura:Double? = null
    var peso:Double? = null
    var colorOjos:String? = null
    var genero:String? = null

    //Metodo init con el cual llenamos nuestras variables
    init {

        this.nombre = nombre
        this.edad = edad
        this.altura = altura
        this.peso = peso
        this.colorOjos = colorOjos
        this.genero = genero

    }

    //Funcion a la cual haremos referencia para obtener los datos
    fun GetNombre():String?{
        return this.nombre
    }

}

fun main(args: Array<String>){

    var person = Persona("Alondra", 36,1.54,50.0,"Cafes", "Mujer")

    println("El nombre es: " + person.GetNombre())

}