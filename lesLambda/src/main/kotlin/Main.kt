package fr.hamtec

fun main() {
//    Anciennement
//    println(calculer(2, 5, Operation.ADDITION))
//    val lambdaSomme = { a: Int, b: Int -> a + b }

    val somme = calculer(100, 5) { a: Int, b: Int -> a + b }
    println(somme)

    println(lambdaCalcu(100, 50))
}

fun calcu(a: Int, b: Int): Int {
    return a - b
}

var lambdaCalcu: (Int, Int) -> Int = { a, b -> a - b }

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
    return operation(a, b)
}

