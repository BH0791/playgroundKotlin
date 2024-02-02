package fr.hamtec

open class Personne(nom: String, age: Int) {
    init {
        println("Nom : $nom \nAge : $age")
    }
    open fun marcher(): Unit{
        println("Personne: Je marche!")
    }
    open fun manger(){
        println("Personne: Je mange!")
    }
}