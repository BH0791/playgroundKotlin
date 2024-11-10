package fr.hamtec.chapitre_2_2

fun utiliserObject(): Unit {
    val labrador = Dog()
    labrador.name = "Dogo"
    labrador.age = -30

    println(labrador.age)

    println(labrador)
}