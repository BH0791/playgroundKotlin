package fr.hamtec

open class Animal(
    var age : Int,
    var name : String,
    var race : String,
    var color : String,
    var size : Int,
    var weight : Float
) {
    //? Méthodes
    fun eat(foodWeight : Int) {
        weight += (foodWeight / 1000f)

    }

    fun run(distance : Int) {
        weight -= (distance / 1000f) / 1000
    }

    override fun toString() : String {
        return "Animal(age=$age, name='$name', race='$race', color='$color', size=$size, weight=$weight )"
    }
}