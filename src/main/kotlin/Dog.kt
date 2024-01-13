package fr.hamtec

import javax.swing.text.Position

class Dog constructor( var name : String, age: Int, var race: String, var color: String, size: Int, var weight: Float, var position : Char  ) {
    //? Attributs
    //var name = name
    //! Pas d'initialisation dans le constructeur pour avoir un contrôle sur age, ici getters/setters
    var age = age
        get() {
            return field * 7
        }
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Vas-te faire...! Pas de changement avec la valeur: $value")
            }
        }
//    var race = race
//    var color = color
//    var size = size
//    var weight = weight
//    var position = position
init {
    println("Attention l'age ne peut-être négative à la construction il est a $age an(s) ==>> " + this.age + " ans.")
    this.age = age
}
    //* Méthode setAge()
//    fun setAge(newAge: Int){
//        if ( newAge > 0 ){
//            age = newAge
//        }else{
//            println("Impossible!")
//        }
//    }
    //? Méthodes
    private fun back() : Unit {
        println("Woof! Woof!")
    }

    fun isSitting() : Boolean = position == 's'
    fun isLaying() : Boolean = position == 'l'
    fun isStanding() : Boolean = position == 't'
    fun eat(foodWeight : Int) {
        back()
        weight += (foodWeight / 1000f)

    }

    fun run(distance : Int) {
        weight -= (distance / 1000f) / 1000
    }

    override fun toString() : String {
        return "Dog(name='$name', race='$race', color='$color', size=$size, weight=$weight, position=$position, age=$age)"
    }
}