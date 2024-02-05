package fr.hamtec

fun main() {
    println("++++++++++++++++++++ Les interfaces ++++++++++++++++++++")

    val dog = Dog(2, "Doggo", "Labrador", "brown", 123, 12.3f,'s', "A14C")
    println(dog)
    dog.lick()
    dog.snuggle()
    snuggle(dog)

    //? Classe anonyme
    val domestic = object : Domestic{
        override val tatoo: String
            get() = "X00X"

        override fun snuggle() {
            println("[Classe anonyme] Snuggle")
        }
    }
    domestic.snuggle()

}

//- Covariante
fun snuggle(animal: Domestic){
    animal.snuggle()
}