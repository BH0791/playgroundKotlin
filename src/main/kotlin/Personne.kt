package fr.hamtec

class Personne(var nom: String = "Tartonpion", var prenom: String = "Noé", val dateNaissance: Int = 1800) {

    constructor(nom: String, prenom: String) : this(nom,prenom,2024)

    //val mDateNaissance: Int= dateNaissance //Initialisation
    var email: String = "tata@yahoo.fr"
    //-Bloc d'initialisation
    init {
        //dateNaissance = 2019
        nom = nom.uppercase().trim()
        println("Le nom de la personne est $nom")
        //println("La date de naissance est $mDateNaissance")
        println("L'email est $email")
    }

    init {
        prenom = prenom.uppercase().trim()
        println("Le prénom de la personne est $prenom")
    }

    override fun toString(): String {
        return "Personne(nom='$nom', prenom='$prenom', date de naissance='$dateNaissance)"

    }

}