package fr.hamtec.classeImbriquee

class Hero(val name: String) {

    var strength = 10

    // inner = accès au parent Hero
    inner class Inventory {
        private val items = mutableListOf<Item>()

        fun add(item: Item) {
            items += item
            println("→ ${item.label} ajouté à l'inventaire de $name.")
        }

        fun list() {
            println("Inventaire de $name :")
            items.forEach { println(" - ${it.label}") }
        }

        // inner = accès au Hero via this@Hero
        inner class Item(val label: String) {
            fun use() {
                println("$name utilise $label !")
                strength += 5
                println("Force actuelle : $strength")
            }
        }
    }

    val inventory = Inventory()

    fun pick(itemName: String) {
        val item = inventory.Item(itemName)
        inventory.add(item)
    }
}