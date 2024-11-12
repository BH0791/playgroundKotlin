package fr.hamtec.chatETchien

class Cat(
    name: String,
    age: Int,
    race: String,
    color: String,
    size: Int,
    weight: Float
) : Animal(name, age, race, color, size, weight) {
    fun meow(): Unit {
        println("meow")
    }

    override fun eat(foodWeight: Int) {
        weight += (foodWeight / 1_0000f) / 1_000
        run(100)
    }
}


