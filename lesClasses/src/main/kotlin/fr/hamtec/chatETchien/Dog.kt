package fr.hamtec.chatETchien

import kotlin.math.pow

class Dog constructor(
    name: String,
    age: Int,
    race: String,
    color: String,
    size: Int,
    weight: Float,
    var position: Char = 't'
) : Animal(name, age, race, color, size, weight) {
    //- Constructeur secondaire
    constructor(name: String) : this(name, 0, "unknown", "unknown", 0, 0f)

    fun bark(): Unit {
        println("woof")
    }

    fun isTooBig(): Boolean = (weight / (size / 100.0).pow(2)) > 25

    override fun eat(foodWeight: Int) {
        weight += (foodWeight / 1_000f) / 1_000
    }

    override fun run(distance: Int) {
        super.run(distance)
    }

    override fun toString(): String {
        return "Dog(name='$name', age=$age, race='$race', color='$color', size=$size, weight=$weight)"
    }
}