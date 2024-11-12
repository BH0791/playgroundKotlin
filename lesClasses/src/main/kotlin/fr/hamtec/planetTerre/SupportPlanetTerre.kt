package fr.hamtec.planetTerre

fun testPlanetTerre(): Unit {
    val person = Person("Louis", "Amstrong", 10)
    println(person.getFullName())
    println(person.getFullNameAncienne())
}

fun testUser(): Unit {

    val user = User("LouisAmstrong@gmail.com", "Amstrong", 54)
    user.email //+ Getter

}