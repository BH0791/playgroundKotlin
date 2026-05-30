package fr.hamtec.classeImbriquee

class Moteur {
    val puissance = 120

    class Pistons {
        fun frapper() = "Les pistons frappent..."
    }

    fun demarrer() = "Moteur de $puissance chevaux démarré"
}

