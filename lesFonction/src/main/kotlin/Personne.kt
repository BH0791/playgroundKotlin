package fr.hamtec

abstract class Personne(protected open var nom: String,  age: Int) {
    init {
        println("\nNom : $nom \nAge : $age")
    }
    abstract fun marcher(): Unit
    abstract fun manger(): Unit
    fun faireUnTrouAvecUnOutil(outil: Int): Int {
        var profondeur = 1_000_000
        println("J'utilise $outil est la profondeur est de $profondeur m")
        return profondeur
    }
}