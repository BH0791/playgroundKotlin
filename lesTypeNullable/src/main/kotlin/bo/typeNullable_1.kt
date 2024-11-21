package fr.hamtec.bo

fun testTypeNullable(): Unit {

    var dog: Dog? = null
    if (getRandomNumber() % 2 == 0) {
        dog = Dog("Doggo")
    }
    dog?.bark()

    val dogName = dog?.name ?: "Defaut name"

    println("The dog's name is $dogName")
}

fun `testOpe!!et?`(): Unit {
    var favoriteActor: String? = "Sandra Oh"

    val lengthOfName = if (favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}

fun testOperateurElvis(): Unit {
    val favoriteActor: String? = "Sandra Oh"

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}

fun getRandomNumber() = (1..100).random()