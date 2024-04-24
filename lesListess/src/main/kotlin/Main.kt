package fr.hamtec

fun main() {
    println("Hello List!")

    val numbers1: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    numbers1.forEach {
        println(it)
    }
    println("List: $numbers")
    println("Size: ${numbers.size}")
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")
    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")
    println()

    val colors = listOf("green", "orange", "blue")
    println("$colors")
    // ** La fonction reversed() renvoie une nouvelle liste dans laquelle les éléments sont dans l'ordre inverse.
    println("Reversed list: ${colors.reversed()}")
    var newList = colors.reversed()
    println("$newList")

    // ** sorted() renvoie une nouvelle liste dans laquelle les éléments sont triés par ordre croissant.
    println("Sorted list: ${colors.sorted()}")
    println()

    val oddNumbers = listOf(5, 3, 7, 1)
    println("List: $oddNumbers")
    println("Sorted list: ${oddNumbers.sorted()}")

}