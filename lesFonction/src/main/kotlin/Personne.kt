package fr.hamtec

abstract class Personne(protected open var nom: String,  age: Int) {
    init {
        println("\nNom : $nom \nAge : $age")
    }
    abstract fun marcher(): Unit
    abstract fun manger(): Unit


}