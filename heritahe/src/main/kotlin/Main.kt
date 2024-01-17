package fr.hamtec.chapitre2_3

fun main() {
    heart()
    val dog = Dog(4, "Doggo", "labrador", "bruwn", 180, 12.5f, 's')
    val cat = Cat(2, "Kitty", "Persan", "grey", 37, 6.21f)

    println(dog)
    println(cat)

    dog.eat(100)
    cat.eat(100)

    println(dog)
    println(cat)

    dog.bark()
    cat.meow()
}

private fun heart() {
    println()
    println("******************************************************************")
    println("******************** Chapitre-2.3 L'héritage *********************")
    println("******************************************************************")
}