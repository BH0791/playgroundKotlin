package fr.hamtec

abstract class Animal(
    var age: Int,
    var name: String,
    var race: String,
    var color: String,
    var size: Int,
    protected var weight: Float
) {
    /**
     * Faire manger un animal
     */
    abstract fun eat(foodWeight: Int)

    abstract fun run(distance: Int)

    override fun toString(): String {
        return "Animal(age = $age, name = $name, race = $race, color = $color, size=$size, weight=$weight)"
    }

}