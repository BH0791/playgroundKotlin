package fr.hamtec

import fr.hamtec.bimbo.DogRace

fun main() {
   
}

fun DemoBook(): Unit {
    heart()
    println("${DogRace.entries[0].number}")
    println("Group : ${DogRace.Golden_Retriever.group} || Section : ${DogRace.Golden_Retriever.section} || Number : ${DogRace.Golden_Retriever.number}")

    println(DogRace.Golden_Retriever)

    println(DogRace.German_Shepherd.lifeSpan().last)

    for (valeur in DogRace.German_Shepherd.lifeSpan()) {
        println(valeur)
    }
}

private fun heart() {
    println()
    println("******************************************************************")
    println("***************** Chapitre-2.5 Les énumérations ******************")
    println("******************************************************************")
}