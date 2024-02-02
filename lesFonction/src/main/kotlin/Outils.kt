package fr.hamtec

interface Outils {
    fun faireUnTrouAvecUnOutil(outil: Int): Int {
        var profondeur = 1_000_000
        profondeur.toDouble()
        println("Arguments =  $outil m est profondeur =  $profondeur m")
        return profondeur
    }

    companion object{
        var argumStatic: Int = 55
        fun methStatique(){
            println("Je suis une méthode static")
        }
    }

}