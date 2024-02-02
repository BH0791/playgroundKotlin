package fr.hamtec

class Eleve(nom: String, age: Int) : Personne(nom,age), ActionPersonne, Outils{
constructor(nom: String) : this(nom, 100)
    var age = 0
        get() = field
        set(value) {
            if (value<0){
                println("Impossibel!!!")
            }else{
                field = value
            }
        }

    /**
     * Méthode pour que l'élévent puisse payer les fraits scolaire
     */
    fun payerFraitScolaire(){
        println("[Eleve] Entrain de payer les frais scolaire")
    }
    override fun manger(){
        println("[Eleve] Entrain de manger")
    }
    override fun marcher(){
        println("[Eleve] Je marche!")
    }

    override fun voler() {
        println("Impossible de voler!")
    }

    override fun plier() {
        println("Je plie les serviettes")
    }

}