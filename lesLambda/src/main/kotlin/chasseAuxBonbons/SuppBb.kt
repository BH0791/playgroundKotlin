package fr.hamtec.chasseAuxBonbons

fun lanceSupp(): Unit {
    val trickFunction = trick
    trick()
    trickFunction()
}

val trick = {
    println("No treats!")
}