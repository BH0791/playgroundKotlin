package fr.hamtec

fun main() {
    println("\n********** TP-KOTLIN **********")
    //lesVariable()
    //lesTableaux()
    //lesTableauxEtLesFonctions()
    //lesTableauxDePrimitives()

//    val labrador = Dog(4, "Doggo", "labrador", "brown", 180, 12.5f)
//    val chiouaoua = Dog("chiouaoua")

//    println(labrador)
//    println(chiouaoua)
//    chiouaoua.age = 5
//    println(chiouaoua)
    val jean = Personne("Bichon     ", "Jean-Luc", 2019)
    val momo = Personne(dateNaissance = 1980)
    val kot = Personne("kadja", "Mondéo")
    println(jean)
    println()
    println(momo)
    println()
    println(kot)
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

fun displayNames(names: Array<String>){
    //-Avec la V3
    for (name in names){
        println(name)
    }
}
fun displayNumbers(numbers: IntArray){
    //-Que pour les primitives
    //-Avec la V3
    for (name in numbers){
        print(name)
    }
}
private fun lesTableauxEtLesFonctions(){
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

fun myfun(a: Int, b: Int): Int {
    return a + b
}

private fun minOf(a: Int, b: Int): Int {
    return if (a < b) a else b
}

fun lesVariable() {


    val immutableString: String = "Hello" /* Immutable variable */
    var mutableInt: Int = 42 /* Mutable variable */
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