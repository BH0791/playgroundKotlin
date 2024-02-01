package fr.hamtec

fun main() {
    println("********** Les structures de contrôle **********")
    //! Any => tous les types
    val age: Any = "14 ans"

    when(age){
        18 -> println("Vous avez 18 ans")
        0,1,2,3,4,5 -> println("Les valeurs 0,1,2,3,4,5")
        in 10..17 -> println("Entre [10 et 17]")
        is String -> println("Veuillez saisir l'âge das le bon format")
        else -> println("Ici c'est fini")
    }
}