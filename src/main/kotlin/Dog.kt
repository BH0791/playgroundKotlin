package fr.hamtec

class Dog {
    //? Attributs
    var age = 0
    var race = ""
    var color = ""
    var size = 0
    var weight = 0f
    var position = 't'

    //? Méthodes
    fun back(): Unit{
        println("Woof! Woof!")
    }
    fun isSitting(): Boolean = position == 's'
    fun isLaying(): Boolean = position == 'l'
    fun isStanding(): Boolean = position == 't'
    fun eat(foodWeight: Int){
        weight += (foodWeight / 1000f)
    }
    fun run(distance: Int){
        weight -= (distance / 1000f) / 1000
    }

}