package fr.hamtec

import fr.hamtec.classScellee.ResultatReseau
import fr.hamtec.classScellee.afficherEtat
import fr.hamtec.classeImbriquee.Hero
import fr.hamtec.classeImbriquee.HeroImbriques
import fr.hamtec.classeImbriquee.Moteur

fun main() {
    TesteHeroImbriques()
}

fun TesteHero(): Unit {
    val hero = Hero.create("Ham le Conquérant")

    val e1 = hero.pick("Épée du Métaverse")
    val e2 = hero.pick("Potion de Recomposition")

    println(e1)
    println(e2)

    hero.inventoryView().forEach { println(" - ${it.label}") }

    val e3 = hero.drop("Épée du Métaverse")
    println(e3)
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