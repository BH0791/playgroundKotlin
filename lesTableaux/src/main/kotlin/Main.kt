package fr.hamtec
import fr.hamtec.travails.*

fun main() {
    entete()
    tableauxVide()
    tableauPrerempli()

    val names = arrayOf("Sylvie", "Ludovic", "Paul", "Jean")
    displayNames(names)
    tableauPrimitive()
    tableauMultiDirectionnel()
    tableauMultiDirectionnelPrerempli()

    val matrix = arrayOf(intArrayOf(2, 3), intArrayOf(1, -1))
    displayMatrix(matrix)
}
