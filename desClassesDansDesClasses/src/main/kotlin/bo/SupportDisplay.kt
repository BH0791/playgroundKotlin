package fr.hamtec.bo

fun TestTP(): Unit {
    heart()
    println("\nClasse interne ( inner class)")
    val computer = ComputerInner(12, 1024, "GTX")
    val motherBoard = computer.MotherBoard("ASUS", "Z490")

    motherBoard.displayComputer()


    println("\nClasses scellées")
    val chien = Animal.Dog("Doggo", 5, 12.5f)
    val chat = Animal.Cat("Kitty", 5.2f)

    println(chien.toString())
    println(chat.toString())
    println()

    chien.eat(500f)
    chat.eat(500f)
    println(chien.toString())
    println(chat.toString())

    println("\nCovariance")
    eatAnimal(chien)
    eatAnimal(chat)
    println(chien.toString())
    println(chat.toString())


}

fun eatAnimal(animal: Animal) {
    animal.eat(10000f)
}

private fun heart() {
    println()
    println("**************************************************************************************")
    println("********************* Chapitre-2.4 Les classes dans les classes **********************")
    println("**************************************************************************************")
}