package fr.hamtec

import fr.hamtec.bo.Dog

fun main() {
    println("Hello les Nullable!")

    var dog: Dog? = null
    if (true){
        dog = Dog("Doggo", "ee")
        doTatoo(dog.getTatoo())
    }
    println(dog)
}
fun doTatoo(tatoo: String?){
    print("méthode : ")
    println(tatoo)
}