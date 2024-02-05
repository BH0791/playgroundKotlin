package fr.hamtec

/**
 * Le chat dans ça plus simple modélisation
 */
class Cat(age: Int, name: String, race: String, color: String, size: Int, weight: Float, override val tatoo: String) :
    Animal(age, name, race, color, size, weight), Domestic {
    fun meow() {
        println("Meow! Meow!")
    }

    override fun eat(foodWeight: Int) {
        weight += (foodWeight / 100f)
    }

    override fun run(distance: Int) {
        weight -= (distance / 1000f) / 1000
    }

    override fun lick() {
        println("Lick, lick")
    }

    override fun snuggle() {
        println("Snuggle")
    }

}