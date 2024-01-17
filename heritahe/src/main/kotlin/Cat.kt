package fr.hamtec.chapitre2_3

/**
 * Le chat dans ça plus simple modélisation
 */
class Cat(age: Int, name: String, race: String, color: String, size: Int, weight: Float) :
    Animal(age, name, race, color, size, weight) {
    fun meow() {
        println("Meow! Meow!")
    }

    override fun run(distance: Int) {
        super.run(distance)
    }
    override fun eat(foodWeight: Int) {
        super.eat(foodWeight)
        //run(500)
    }

}