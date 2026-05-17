package fr.hamtec

import fr.hamtec.genericite.Cat
import fr.hamtec.genericite.Dog
import fr.hamtec.genericite.Kennel

fun main() {

    val dogKennel = Kennel<Dog>()
    val catKennel = Kennel<Cat>()
    dogKennel.displayKennel()
    dogKennel.addAnimal(Dog("Dogo"))
    dogKennel.displayKennel()
}