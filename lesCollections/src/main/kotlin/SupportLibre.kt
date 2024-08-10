fun PresentationList(): Unit {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    println("List: $numbers")
    println("Size: ${numbers.size}")

    // Access elements of the list
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")

    // Use the contains() method
    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")

    val colors = listOf("green", "orange", "blue")
    println("\nReversed list: ${colors.reversed()}")
    println("List: $colors")
    println("Sorted list: ${colors.sorted()}")

    val oddNumbers = listOf(5, 3, 7, 1)
    println("\nList: $oddNumbers")
    println("Sorted list: ${oddNumbers.sorted()}")
}

fun PresentationListModifiable(): Unit {
    val entrees = mutableListOf<String>()
    println("Entrees: $entrees")

    // Add individual items using add()
    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")

    // Add a list of items using addAll()
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")

    // Remove an item using remove()
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")
    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
    println("Entrees: $entrees")

    // Remove an item using removeAt() with an index
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")

    // Clear out the list
    entrees.clear()
    println("Entrees: $entrees")

    // Check if the list is empty
    println("Empty? ${entrees.isEmpty()}")

}

//-- Exemple simple
open class Item(val name: String, val price: Int)

class Noodles: Item("Noodles", 10) {
    @Override
    override fun toString(): String {
        return name
    }
}

class Vegetables(vararg val toppings: String): Item("Vegetables", 5) {
    @Override
    override fun toString(): String {
        if(toppings.isEmpty()) {
            return "$name Chef's Choice"
        } else {
            return name + " " + toppings.joinToString("-")
        }
    }
}

class Order(val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for(item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}

fun commandeResto(): Unit {
    val order1 = Order(1)
    order1.addItem(Noodles())
    order1.print()

    println()

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    order2.print()

    println()

    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    order3.print()
}
fun commandeAmeliorer(): Unit {
    val ordersList = mutableListOf<Order>()

    val order1 = Order(1)
    order1.addItem(Noodles())
    ordersList.add(order1)

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    ordersList.add(order2)

    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    ordersList.add(order3)

    val order4 = Order(4).addItem(Noodles()).addItem(Vegetables("Cabbage", "Onion"))
    ordersList.add(order4)

    ordersList.add(
            Order(5)
                    .addItem(Noodles())
                    .addItem(Noodles())
                    .addItem(Vegetables("Spinach")))

    for (order in ordersList) {
        order.print()
        println()
    }
}