package fr.hamtec

class Enseignant(override var nom: String, age: Int) : Personne(nom,age){
    /*
        nom est une proprièté alors que age est un paramettre
     */
    fun enseigner(){
        println("[Enseignant] $nom Entrain d'enseigner")
    }

     override fun marcher() {
        println("[Enseignant] $nom marche!")
    }

    override fun manger() {
        println("[Enseignant] $nom mange!")
    }
}