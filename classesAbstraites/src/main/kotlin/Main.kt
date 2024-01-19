package fr.hamtec.methAbstract

import zoo.*

fun main() {
    heart()

    val chien = Dog(4, "Doggo", "labrador", "brown", 180, 12.5f, 's')
    val chat = Cat(2, "Kitten", "persan", "gray", 60, 6.3f)

    println(chien)
    println(chat)
    println("Courrir")
    chien.run(10000)
    chat.run(100000)
    println(chien)
    println(chat)

    println("Applique la covariance")
    eatAnimal(chien)
    eatAnimal(chat)

    println(chien)
    println(chat)

    println("Anonyme")

    val animal = object : Animal(1, "unknown", "unknow", "unknown", 10, 5f){
        override fun eat(foodWeight: Int) {
            weight += (foodWeight / 100f)
        }

        override fun run(distance: Int) {
            weight -= (distance / 1000f) / 1000
        }

    }
    println("==> $animal")

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