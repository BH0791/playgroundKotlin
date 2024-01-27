package fr.hamtec

fun main() {
    println("\nEnumération")

    val chien = Dog("Neo",DogRace.Beagle, Color.GREEN)

    println("Le chein est ${chien.color.rgb}")
}