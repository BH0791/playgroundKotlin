package fr.hamtec.chapitre_2_2

fun main() {
    heart()
    val labradore = Dog()

    labradore.age = 10
    println(labradore)

    labradore.bark()

    labradore.age = -5
    //println(labradore)
}



private fun heart() {
    println()
    println("******************************************************************")
    println("******************** Chapitre-2.2 Les classes ********************")
    println("******************************************************************")
}