package fr.hamtec.bo

fun testTypeNullable(): Unit {

    var dog: Dog? = null
    if (getRandomNumber() % 2 == 0) {
        dog = Dog("Doggo")
    }
    if (dog != null) {
        dog.bark()
    }
}

fun getRandomNumber() = (1..100).random()