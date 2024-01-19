package fr.hamtec.methAbstract

import zoo.*

fun main() {
    heart()

    val chien = Dog(4, "Doggo", "labrador", "brown", 180, 12.5f, 's')
    val chat = Cat(2, "Kitten", "persan", "gray", 60, 6.3f)

    println(chien)
    println(chat)

    println("Applique la covariance")
    eatAnimal(chien)
    eatAnimal(chat)

    println(chien)
    println(chat)

}
fun eatAnimal(animal: Animal){

    animal.eat(100)
}
private fun heart() {
    println()
    println("**************************************************************************************")
    println("************************ Chapitre-8.1 Les classes abstraites *************************")
    println("**************************************************************************************")
}