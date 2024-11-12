package fr.hamtec.chatETchien

abstract class Animal(
    var name: String,
    var age: Int,
    var race: String,
    var color: String,
    var size: Int,
    protected var weight: Float
) {
    //-open
    abstract fun eat(foodWeight: Int)

    //+run
    open fun run(distance: Int): Unit {
        weight -= (distance / 1000f) / 1000
    }

    //*override
    override fun toString(): String {
        return "Animal(name='$name', age=$age, race='$race', color='$color', size=$size, weight=$weight)"
    }


}