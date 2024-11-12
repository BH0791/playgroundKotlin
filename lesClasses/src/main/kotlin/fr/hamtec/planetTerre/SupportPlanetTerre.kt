package fr.hamtec.planetTerre

fun testPlanetTerre(): Unit {
    val person = Person("Louis", "Amstrong", 10)
    println(person.getFullName())
    println(person.getFullNameAncienne())
}