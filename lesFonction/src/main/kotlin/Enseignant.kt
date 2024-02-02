package fr.hamtec

class Enseignant(nom: String, age: Int) : Personne(nom,age){
    fun enseigner(){
        println("Entrain d'enseigner")
    }
}