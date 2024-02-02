package fr.hamtec

class Eleve(nom: String, age: Int) : Personne(nom,age){
    fun payerFraitScolaire(){
        println("Entrain de payer les frais scolaire")
    }
//    override fun manger(){
//        println("Entrain de manger")
//    }
//    override fun marcher(){
//        println("Je marche!")
//    }
}