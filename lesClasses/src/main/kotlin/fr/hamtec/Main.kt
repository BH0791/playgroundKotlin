package fr.hamtec

import fr.hamtec.classScellee.ResultatReseau
import fr.hamtec.classScellee.afficherEtat
import fr.hamtec.classeImbriquee.HeroImbriques
import fr.hamtec.classeImbriquee.Moteur

fun main() {
    TesteHeroImbriques()
}

fun TesteHeroImbriques(): Unit {
    val hero = HeroImbriques("Ham le Conquérant")

    hero.pick("Épée du Métaverse")
    hero.pick("Potion de Recomposition")
    hero.inventory.list()
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