package fr.hamtec

fun main() {
    println("\n********** Hello World! **********")
    val enseignant1 = Enseignant("Tacite", 21)
    enseignant1.marcher()


    val eleve1 = Eleve("Louis")
    eleve1.payerFraitScolaire()
    eleve1.marcher()
    eleve1.voler()
    eleve1.faireUnTrouAvecUnOutil(1000)
    Outils.methStatique()
    println(Outils.argumStatic)

}