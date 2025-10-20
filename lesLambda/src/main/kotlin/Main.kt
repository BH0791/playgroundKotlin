package fr.hamtec

fun main() {
//    Anciennement
//    println(calculer(2, 5, Operation.ADDITION))
//    val lambdaSomme = { a: Int, b: Int -> a + b }

    val somme = calculer(100, 5) { a: Int, b: Int -> a + b }
    val deuxiemeSomme = calculer(a = 200, b = 100, operation = { a: Int, b: Int -> a - b })
    println(somme)
    println(deuxiemeSomme)

    executerAction { println("Exécution de l'action maintenant !") }

    traiterChaine("bonjour le monde") { str ->
        str.uppercase()
    }
    traiterChaine(entree = "Hamid") {
        it.reversed()
    }

}


/*enum class Operation { ADDITION, SOUSTRACTION }

fun calculer(a: Int, b: Int, op: Operation): Int {
    return when (op) {
        Operation.ADDITION -> a + b
        Operation.SOUSTRACTION -> a - b
    }
}

*/

fun calculer(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
): Int {
    val resultat = operation(a, b)
    return resultat
}

fun executerAction(
    action: () -> Unit
) {
    println("Sur le point d'exécuter l'action...")
    action()
    println("Action terminée.")
}

fun traiterChaine(
    entree: String,
    processeur: (String) -> String
) {
    val resultat = processeur(entree)
    println("Résultat traité : $resultat")
}