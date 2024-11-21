package fr.hamtec.genericite

class Kennel<T> {
    companion object {
        private const val KENNEL_CAPACITE = 10
    }

    private val animals = arrayOfNulls<Any>(KENNEL_CAPACITE)

    var animalCounter = 0
        private set

    private fun getAvailablePlacesNumber(): Int = KENNEL_CAPACITE - animalCounter

    fun addAnimal(animal: T): Boolean {
        return if (getAvailablePlacesNumber() < 0) {
            false
        } else {
            animals[animalCounter] = animal
            animalCounter++
            true
        }
    }

    fun displayKennel() {
        println("Il y a ${animalCounter}/${KENNEL_CAPACITE} chiens dans le chenil ")
        for (dog in animals) {
            println(dog)
        }
    }

}