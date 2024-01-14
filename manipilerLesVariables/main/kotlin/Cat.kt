package fr.hamtec

class Cat(
    age : Int,
    name : String,
    race : String,
    color : String,
    size : Int,
    weight : Float
) : Animal(age, name, race, color, size, weight) {
    //? Méthodes
    //* miauler
    fun meow(){
        println("Meow! Miow!")
    }
}