data class Dog(val name: String)
data class Cat(val name: String)


val dogs = listOf(Dog("Doggo"), Dog("Heyden"))

fun TestMap(): Unit {
    println(dogs)
    val cats = dogs.map { Cat(it.name) }
    println(cats)
}
fun TestMapIndexed(): Unit {
    println("mapIndexed")
    println(dogs)
    val cats = dogs.mapIndexed{index, dog ->
        val number = if(index % 2 == 0) 0 else 1
        Cat("${dog.name}-$number")
    }
    println(cats)
}