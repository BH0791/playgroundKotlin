package fr.hamtec

fun main() {
    println("\nHello Singleton!")

    Kennel.displayKennel()
    val doggo = Dog("Doggo")
    val isDoggoAdded = Kennel.addDog(doggo)

    if (isDoggoAdded == true){
        println("Doggo has been added successfully")
    }else{
        println("Cannot add Doggo")
    }

    //+ 

    println()
    Kennel.displayKennel()
}