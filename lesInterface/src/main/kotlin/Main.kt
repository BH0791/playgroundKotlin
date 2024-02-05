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
    val bog = Dog(8, "Agent", "Labrador", "black", 589, 18.3f,'t', "A14C", "X007X")
    println(bog)
}

//- Covariante
fun snuggle(animal: Domestic){
    animal.snuggle()
}

//! Mise en œuvre d’interfaces par délégation

interface MyInterface {
    fun someMethod(): String
}

class MyClass() : MyInterface {
    override fun someMethod(): String {
        return("Hello, World!")
    }
}
class MyDerivedClass(myInterface: MyInterface) : MyInterface by myInterface