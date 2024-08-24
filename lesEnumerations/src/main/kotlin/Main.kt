package fr.hamtec

import fr.hamtec.bimbo.Dog
import fr.hamtec.bimbo.DogRace
import fr.hamtec.dement.*

fun main() {
    val color = SecondCardType.SILVER.color
    println("$color")
    val cashbackPercent = thirdCardType.SILVER.calculateCashbackPercent()
    println("$cashbackPercent")
    val creditLimit = CardType.PLATINUM.getCreditLimit()
    println("$creditLimit")
}

fun DemoBook(): Unit {
    heart()
    println("${DogRace.values()[0].number}")
    println("Group : ${DogRace.Golden_Retriever.group} || Section : ${DogRace.Golden_Retriever.section} || Number : ${DogRace.Golden_Retriever.number}")

    println(DogRace.Golden_Retriever)

    println(DogRace.German_Shepherd.lifeSpan().last)

    for (valeur in DogRace.German_Shepherd.lifeSpan()){
        println(valeur)
    }
}
private fun heart() {
    println()
    println("******************************************************************")
    println("***************** Chapitre-2.5 Les énumérations ******************")
    println("******************************************************************")
}