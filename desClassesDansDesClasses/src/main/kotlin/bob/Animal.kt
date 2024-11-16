package fr.hamtec.bob

sealed class Animal(open val name: String, open var age: Int) {

    init {
        age = age * 10
    }

    abstract fun eat()
    override fun toString(): String {
        return "Animal(name='$name', age=$age)"
    }

    class Cat(name: String, age: Int) : Animal(name, age) {
        override fun eat() {
            println("Je mange!")
            TODO("Pas encore mis en œuvre")
        }
    }

}