package fr.hamtec

import fr.hamtec.classScellee.ResultatReseau
import fr.hamtec.classScellee.afficherEtat
import fr.hamtec.classeImbriquee.Moteur

fun main() {
    
}

fun TesteClasseScellees(): Unit {
    //    testUser()
    println("Classes scellées ==>")
    afficherEtat(ResultatReseau.Chargement)
    afficherEtat(ResultatReseau.Succes("Les donn&es sont chargées"))
    afficherEtat(ResultatReseau.Chargement)
}

fun TestClasseimbriquee(): Unit {
    val moteur: Moteur = Moteur()
    println(moteur.demarrer())

    val pistons: Moteur.Pistons = Moteur.Pistons()
    println(pistons.frapper())
}