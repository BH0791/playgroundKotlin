package fr.hamtec

fun main() {
    println("\n********** TP-KOTLIN **********")
    utilObjheritage()

}

fun utilObjheritage() {
    val chien = Dog(4, "Doggo", "labrador", "brown",180, 15.2f, 's')
    val chat = Cat(2, "Kitti", "Persan", "grey", 37, 6.21f)
    println(chien)
    println(chat)
}

private fun utilObjMethode(){
//    var labrador = DogLesClassesP101("Doggo", 4, "labrador", "brown", 180, 12.5f)
//    println(labrador)
//    labrador.age = 10
//    println(labrador)
//    labrador.age = -5
//    println(labrador)
//    println()
//    val chiouaoua = DogLesClassesP101("Choupinette")
//    println(chiouaoua)
}
fun utiliserObjet() {
//    var labrador = Dog()
//? Attributs
//    labrador.name = "Doggo"
//    labrador.weight = 12.5f
//    labrador.age = 4
//    labrador.color = "brown"
//    labrador.race = "labrador"
//    labrador.size = 180
//    labrador.position = 's'
//? Méthodes
    //labrador.back()
//    println(labrador.weight)
//    labrador.eat(100)
//    println(labrador.weight)
//    labrador.run(2000)
//    println(labrador.weight)
//    println()
//! Affichage
//    println( labrador )
}

fun lesTableauxDePrimitives() {
    //-Tableau vide de 5 entiers
    val numbers1 = intArrayOf(5)
    //-Tableau qui contiendra cinq entiers
    val numbers = intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1)
    displayNumbers(numbers)
    // Ou
    //displayNumbers(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1))
}

fun displayNames(names : Array<String>) {
    //-Avec la V3
    for (name in names) {
        println(name)
    }
}

fun displayNumbers(numbers : IntArray) {
    //-Que pour les primitives
    //-Avec la V3
    for (name in numbers) {
        print(name)
    }
}

private fun lesTableauxEtLesFonctions() {
    val names = arrayOf("Sylvie", "Ludovic", "Paul", "Jean")
    displayNames(names)
}

private fun lesTableaux() {
    val names = arrayOf("Sylvie", "Ludovic", "Paul", "Jean")
    val indice = names[2]
    println(names[0] + " $indice")
//-V1
    for (index in 0..names.size - 1) {
        print(names[index])
    }
    println()
//-V2
    for (index in names.indices) {
        print(names[index])
    }
    println()
//-V3
    for (name in names) {
        print(name)
    }
}

fun myfun(a : Int, b : Int) : Int {
    return a + b
}

private fun minOf(a : Int, b : Int) : Int {
    return if (a < b) a else b
}

fun lesVariable() {


    val immutableString : String = "Hello" /* Immutable variable */
    var mutableInt : Int = 42 /* Mutable variable */
    val inferredType = 42 // Int inferred
    println(immutableString)

    for (i in 1..10) {
        print(i)
    }
    when (3) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }


    println(myfun(10, 20))
    println("La plus petite est = " + minOf(10, 20))
    var lapp = minOf(15, 50)
    println("Est = $lapp")

}