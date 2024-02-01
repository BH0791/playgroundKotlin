package fr.hamtec

fun main() {
    println("********** Les variables **********")
    println("Hello ${saluer()}")
    println("==> ${appel("Hello")}")
}

fun saluer(): String {
    return "Salue!"
}
fun appel(txt: String): String{

    return txt
}