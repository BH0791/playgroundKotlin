package fr.hamtec

fun main() {
    println("Fonction d'ordre supèrieur")
    displayTextInLambda { println("Je suis une fonction") }
}
fun displayTextInLambda( lambda: () -> Unit ){
    println("Befor lambda")
    lambda()
    println("After lambda")
}