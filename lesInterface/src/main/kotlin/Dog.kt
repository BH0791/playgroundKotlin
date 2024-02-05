package fr.hamtec

import kotlin.math.pow

class Dog(age: Int, name: String, race: String, color: String, size: Int, weight: Float, var position: Char = 't',
          override val tatoo: String
) :
    Animal(age, name, race, color, size, weight), Domestic {
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

    override fun run(distance: Int) {
        weight -= (distance / 1000f) / 1000
    }

    override fun snuggle() {
        println("[méthode abstraite override d'interface] Snuggle")
    }
}