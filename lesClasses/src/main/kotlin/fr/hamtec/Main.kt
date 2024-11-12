package fr.hamtec

import fr.hamtec.planetTerre.Person

fun main() {
    val pers = Person()
    println(pers.name)
    pers.name = "Hehe"
    println(pers.name)

}

private fun heart() {
    println()
    println("******************************************************************")
    println("******************** Chapitre-2.2 Les classes ********************")
    println("******************************************************************")
}