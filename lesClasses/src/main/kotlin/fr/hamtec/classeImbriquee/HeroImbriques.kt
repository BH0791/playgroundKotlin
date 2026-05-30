package fr.hamtec.classeImbriquee

class HeroImbriques(val name: String) {
    // Inventaire du héros
    class Inventory {
        private val items = mutableListOf<Item>()

        fun add(item: Item) {
            items += item
            println("→ ${item.label} ajouté à l'inventaire.")
        }

        fun list() {
            println("Inventaire :")
            items.forEach { println(" - ${it.label}") }
        }

        // Objet dans l'inventaire
        class Item(val label: String)
    }

    val inventory = Inventory()

    fun pick(itemName: String) {
        val item = Inventory.Item(itemName)
        inventory.add(item)
    }
}