package fr.hamtec.chapitre_2_2

fun main() {
    heart()
    val labradore = Dog("Doggo", 5, "Labrador", "brown", 180, 15.5f, 's')
    val labradorebis = Dog("Choupette")
    val labradorebisbis = Dog()
    println(labradore)
    println()
    println(labradorebis)
    println()
    println(labradorebisbis)
}



private fun heart() {
    println()
    println("******************************************************************")
    println("******************** Chapitre-2.2 Les classes ********************")
    println("******************************************************************")
}