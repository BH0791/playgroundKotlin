package fr.hamtec.chatETchien

fun utiliserObject(): Unit {
    val minette = Cat("Mioumiou", 2, "Siamois", "green", 110, 7.5f)
    val labrador = Dog("Dogo", 4, "labrador", "brown", 180, 10.5f)

    val animal = object : Animal("Animal", 1, "unknown", "unknown", 10, 5f) {
        override fun eat(foodWeight: Int) {
            weight += (foodWeight / 1_000f)
        }
    }
    println(animal.toString())
}