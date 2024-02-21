package fr.hamtec

fun main() {
    println("********** Les variables **********")
//    println("Hello ${saluer()}")
//    println("==> ${appel("Hello")}")

    var nom: String = String.format("J'ai %d", 54)
    println(nom)
}

fun saluer(): String {
    return "Salue!"
}
fun appel(txt: String): String{
    return txt
}