package fr.hamtec.classeImbriquee

// 1) Ubiquitous Language : tout part du domaine "Hero"

// Aggregate Root
class Hero private constructor(
    val id: HeroId,
    val name: String,
    private val inventory: Inventory
) {

    // Identité forte (Value Object)
    @JvmInline
    value class HeroId(val value: String)

    // Sous-domaine interne : Aggregate
    class Inventory private constructor(
        private val items: MutableList<Item>
    ) {

        // Value Object
        data class Item(val label: String)

        fun contains(label: String): Boolean =
            items.any { it.label == label }

        fun add(item: Item) {
            if (!items.contains(item)) items += item
        }

        fun remove(label: String) {
            items.removeIf { it.label == label }
        }

        fun snapshot(): List<Item> = items.toList()

        companion object {
            fun empty() = Inventory(mutableListOf())
        }
    }

    // Domain Events (ADT / sealed)
    sealed class DomainEvent {
        data class ItemPicked(val heroId: HeroId, val itemLabel: String) : DomainEvent()
        data class ItemDropped(val heroId: HeroId, val itemLabel: String) : DomainEvent()
    }

    // Commandes métier (API du domaine)
    fun pick(itemLabel: String): DomainEvent {
        inventory.add(Inventory.Item(itemLabel))
        return DomainEvent.ItemPicked(id, itemLabel)
    }

    fun drop(itemLabel: String): DomainEvent {
        if (inventory.contains(itemLabel)) {
            inventory.remove(itemLabel)
            return DomainEvent.ItemDropped(id, itemLabel)
        }
        // In DDD strict : soit exception, soit aucun event
        throw IllegalStateException("Item '$itemLabel' not in inventory")
    }

    fun inventoryView(): List<Inventory.Item> =
        inventory.snapshot()

    companion object {
        // Factory (invariants à la création)
        fun create(name: String): Hero {
            val id = HeroId(java.util.UUID.randomUUID().toString())
            val inventory = Inventory.empty()
            return Hero(id, name, inventory)
        }
    }
}
