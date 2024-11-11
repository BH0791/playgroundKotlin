package fr.hamtec.chatETchien

import kotlin.math.abs

class Dog constructor(
    var name: String,
    var age: Int,
    var race: String,
    var color: String,
    var size: Int,
    var weight: Float,
    var position: Char = 't'
) {
    //--Contrôle de l'age
    init {
        if(age in 0..100){
            age = age
        } else{
            age = 55
        }
    }

    //-- Méthodes

    fun isSitting(): Boolean = position == 's'
    fun islaying(): Boolean = position == 'l'
    fun isStanding(): Boolean = position == 't'

    fun eat(foodWeight: Int){
        weight += (foodWeight / 1000f)
    }
    fun run(distance: Int){
        weight -= (distance / 1000f) / 1000
    }

    override fun toString(): String {
        return "Dog(" +
                "\n\tname = $name " +
                "\n\tage = $age " +
                "\n\trace = $race " +
                "\n\tcolor = $color " +
                "\n\tweight = $weight " +
                "\n\tposition = $position" +
                "\n)"
    }

}