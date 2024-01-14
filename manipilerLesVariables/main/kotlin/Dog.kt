package fr.hamtec

class Dog(
    age : Int,
    name : String,
    race : String,
    color : String,
    size : Int,
    weight : Float,
    var position: Char = 't'
) : Animal(age, name, race, color, size, weight) {
    //? Méthodes
    private fun back() : Unit {
        println("Woof! Woof!")
    }
    override fun toString() : String {
        return "Animal(age=$age, name='$name', race='$race', color='$color', size=$size, weight=$weight, position=$position )"
    }
}