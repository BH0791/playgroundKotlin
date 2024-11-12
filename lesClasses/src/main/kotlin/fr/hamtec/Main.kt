package fr.hamtec

import fr.hamtec.planetTerre.Person

fun main() {
    val person = Person("Louis", "Amstrong", 10)
    println(person.getFullName())
    println(person.getFullNameAncienne())

}

private fun heart() {
    println()
    println("******************************************************************")
    println("******************** Chapitre-2.2 Les classes ********************")
    println("******************************************************************")
}