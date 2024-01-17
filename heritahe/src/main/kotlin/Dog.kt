package fr.hamtec.chapitre2_3

import kotlin.math.pow

class Dog(age: Int, name: String, race: String, color: String, size: Int, weight: Float, var position: Char = 't')
    : Animal(age, name, race, color, size, weight) {
        fun bark(){
            println("Woof! Woof!")
        }
    fun isTooBig(): Boolean = (weight / (size / 100.0).pow(2)) > 25
}