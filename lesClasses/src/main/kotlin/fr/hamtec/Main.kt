package fr.hamtec

import fr.hamtec.classScellee.ResultatReseau
import fr.hamtec.classScellee.afficherEtat

fun main() {
//    testUser()
    println("Classes scellées ==>")
    afficherEtat(ResultatReseau.Chargement)
    afficherEtat(ResultatReseau.Succes("Les donn&es sont chargées"))
    afficherEtat(ResultatReseau.Chargement)
}

