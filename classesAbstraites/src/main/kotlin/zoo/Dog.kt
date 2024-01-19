package zoo

import kotlin.math.pow

class Dog(age: Int, name: String, race: String, color: String, size: Int, weight: Float, var position: Char = 't') :
    Animal(age, name, race, color, size, weight) {
    fun bark() {
        println("Woof! Woof!")
    }

    /**
     * Calcul l'IMC (indice de masse corporelle)
     */
    fun isTooBig(): Boolean = (weight / (size / 100.0).pow(2)) > 25
    override fun eat(foodWeight: Int) {
        weight += (foodWeight / 100f)
    }
}