package fr.hamtec.bo

fun testTypeNullable(): Unit {

    var dog: Dog? = null
    if (getRandomNumber() % 2 == 0) {
        dog = Dog("Doggo")
    }
    dog?.bark()

    val dogName = if (dog != null) {
        dog.name
    } else {
        "Defaut name"
    }
    println("The dog's name is $dogName")
}

fun getRandomNumber() = (1..100).random()