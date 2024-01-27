package fr.hamtec

object Kennel {

    private const val KENNEL_CAPACITY = 10
    private val dogs = arrayOfNulls<Dog>(KENNEL_CAPACITY)
    var dogsCounter = 0
        private set

    //+ --- Méthodes ---
    fun getAvailablePlacesNumber(): Int = KENNEL_CAPACITY - dogsCounter

    fun addDog(dog: Dog): Boolean{
        return if (getAvailablePlacesNumber() < 0){
            false
        }else{
            dogs[dogsCounter] = dog
            dogsCounter++
            true
        }
    }

    fun displayKennel(){
        println("There are $dogsCounter/${KENNEL_CAPACITY} dogs into the kennel.")
        for (dog in dogs){
            println(dog)
        }
    }

}