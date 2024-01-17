package fr.hamtec.chapitre2_3

/**
 * ??
 */
fun main() {
    heart()
    val dog = Dog(4, "Doggo", "labrador", "bruwn", 180, 12.5f, 's')
    val cat = Cat(2, "Kitty", "Persan", "grey", 37, 6.21f)

    println(dog)
    println(cat)

    println()   // ligne en plus
    eatAnimal(dog)
    eatAnimal(cat)

    println(dog)
    println(cat)

    dog.bark()
    cat.meow()
    println("************************** Covariance **************************")
    gessAnimal(dog)
    gessAnimal(cat)
    println("************************ Covariance fin ************************")

}

private fun gessAnimal(animal: Animal) {
    //? Méthode-1
    println("Méthode-1")
    if (animal is Dog) {
        println("C'est un chien")
    } else if (animal is Cat) {
        println("C'est un chat")
    }
    //? Méthode-2
    println("Méthode-2")
    when (animal) {
        is Dog -> println("C'est un chien")
        is Cat -> println("C'est un chat")
    }

}


fun eatAnimal(animal: Animal){
    animal.eat(100)
}
private fun heart() {
    println()
    println("******************************************************************")
    println("******************** Chapitre-2.3 L'héritage *********************")
    println("******************************************************************")
}