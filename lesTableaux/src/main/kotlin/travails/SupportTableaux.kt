package fr.hamtec.travails


fun tableauMultiDirectionnelPrerempli() {
    println("\n\nTableau de Multidirectionne ==> arrayOf(arrayOf(2, 3), arrayOf(1, -1)")
    val matrix = arrayOf(arrayOf(2, 3), arrayOf(1, -1))
    for (row in matrix) {
        for (column in row) {
            print("$column\t")
        }
        println()
    }
}

fun tableauMultiDirectionnel() {
    println("\nTableau de Multidirectionne ==> Array(6){ arrayOfNulls<Int>(4) } de 6 row et 4 column")
    val matrix = Array(6) { arrayOfNulls<Int>(4) }
    for (row in matrix) {
        for (column in row) {
            print("$column\t")
        }
        println()
    }
}

fun tableauPrimitive() {
    println("\nTableau de primitives")
    val numbers = IntArray(5)
    for (valeur in numbers) {
        println(valeur)
    }
}

fun tableauPrerempli() {
    println("\nUn tableau d’entiers. => arrayOf(10, 32, 44, 65, 90)")
    val numbers = arrayOf(10, 32, 44, 65, 90)
    for (valeur in numbers) {
        println(valeur)
    }
}

fun displayNames(names: Array<String>) {
    println("\nTableau et les fonctions => fun displayNames(names: Array<String>) ")
    for (valeur in names) {
        println(valeur)
    }
}

fun tableauxVide() {
    println("\nTableau vide => arrayOfNulls<Int>(5)")
    val numbers = arrayOfNulls<Int>(5)
    for (valeur in numbers) {
        println(valeur)
    }
}

fun entete() {
    println("\n++++++++++++++++++++++++++++++++++++++++")
    println("+++++++++++ Les tableaux +++++++++++++++")
    println("++++++++++++++++++++++++++++++++++++++++")
}

fun displayMatrix(matrix: Array<IntArray>){
    println("\nMéthode qui reçois un tableau deux dimenssion")
    for (row in matrix) {
        for (column in row) {
            print("$column\t")
        }
        println()
    }
}