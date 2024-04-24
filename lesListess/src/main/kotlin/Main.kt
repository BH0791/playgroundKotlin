package fr.hamtec

fun main() {
    println("Hello List!")
//    presentationDesListes()
//    presentationDesListesModifiable()
//    presentationDesListesModifiable()
    lireUneBoucleFor()

}
private fun lireUneBoucleFor(){
    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    for (name in names) {
        println("$name - Number of characters: ${name.length}")
    }
}
private fun lireUneBoucleWhile() {
    val guestsPerFamily = listOf(2, 4, 1, 3)
    println("$guestsPerFamily")
    var totalGuests = 0
    var index = 0
    while(index < guestsPerFamily.size){
        totalGuests += guestsPerFamily[index]
        index++
    }
    println("Total Guest Count: $totalGuests")
}

private fun presentationDesListesModifiable() {
    //- MutableList
    val entrees: MutableList<String> = mutableListOf()
    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")
    println()

    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")
    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
    println("Entrees: $entrees")
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")
    entrees.clear()
    println("Entrees: $entrees")
    println("Empty? ${entrees.isEmpty()}")
}

private fun presentationDesListes() {
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