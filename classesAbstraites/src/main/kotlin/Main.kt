package fr.hamtec.methAbstract

import zoo.Cat
import zoo.Dog

fun main() {
    heart()

    val chien = Dog(4, "Doggo", "labrador", "brown", 180, 12.5f, 's')
    val chat = Cat(2, "Kitten", "persan", "gray", 60, 6.3f)


    println(chien)
    println(chat)

}
private fun heart() {
    println()
    println("******************************************************************")
    println("************** Chapitre-8.1 Les classes abstraites ***************")
    println("******************************************************************")
}