package fr.hamtec.bo

/**
 * permet de modéliser une hiérachie de classes
 */
sealed class Animal(val name: String) {

    abstract fun eat(foodWeight: Float)
    class Dog(name: String, val age: Int, var weight: Float): Animal(name){
        fun bark(){
            println("Woof! Woof!")
        }

        override fun eat(foodWeight: Float) {
            weight += foodWeight / 100f
        }

        override fun toString(): String {
            return "Dog(age=$age, weight=$weight)"
        }

    }
    class Cat(name: String, var weight: Float): Animal(name){
        fun meow(){
            println("Meow! Meow!")
        }

        override fun eat(foodWeight: Float) {
            weight += (foodWeight / 100f)
        }

        override fun toString(): String {
            return "Cat(name = $name, weight=$weight)"
        }

    }

}