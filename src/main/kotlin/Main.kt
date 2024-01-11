package fr.hamtec

fun main() {

    lesTableaux()

}
private fun lesTableaux(){
    val numbers = arrayOf("Sylvie", "Ludovic", "Paul", "Jean")
    println(numbers[0])
}
fun myfun(a: Int, b: Int): Int{
    return a + b
}
private fun minOf(a: Int, b: Int): Int {
    return if (a < b) a else b
}
private fun lesVariable(){
    //    var nombreDeVoiture: Int = 35000
//    var argent: Long = 1001L
//    var age: Byte = 100
//    var prixAspirateur: Short = 123
//    var prenom: String = "Ludovic"
//    var estVrai: Boolean = true
//    var resultatDivision: Double = 0.3456314478541552585211
//    var resultatSoustraction: Float = 0.365f
//    var lettre : Char ='A'
//
//    var val1: Int = 10
//    var val2: Int = 20
    val immutableString: String = "Hello" // Immutable variable
    var mutableInt: Int = 42 // Mutable variable
    val inferredType = 42 // Int inferred
    println(immutableString)
//    for (i in 1..10){
//        print(i)
//    }
//    when (3) {
//        1 -> print("x == 1")
//        2 -> print("x == 2")
//        else -> { // Note the block
//            print("x is neither 1 nor 2")
//        }
//    }

    println(myfun(10, 20))
    println("La plus petite est = " + minOf(10, 20))
    var lapp = minOf(15,50)
    println("Est = $lapp")
}