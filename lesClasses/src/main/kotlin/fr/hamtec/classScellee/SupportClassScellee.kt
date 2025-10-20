package fr.hamtec.classScellee

sealed class ResultatReseau {
    data class Succes(val donnees: String) : ResultatReseau()
    object Chargement : ResultatReseau()
    data class Echec(val erreur: Exception) : ResultatReseau()
}

fun afficherEtat(resultat: ResultatReseau) {
    when (resultat) {
        is ResultatReseau.Succes -> println("Succès: ${resultat.donnees}")
        is ResultatReseau.Chargement -> println("Chargement en cours...")
        is ResultatReseau.Echec -> println("Erreur: ${resultat.erreur.message}")
    }
}