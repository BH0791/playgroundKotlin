data class Dog(val name: String)
data class Cat(val name: String)


val dogs = listOf(Dog("Doggo"), Dog("Heyden"))

fun TestMap(): Unit {
    println("map")
    println(dogs)
    val cats = dogs.map { Cat(it.name) }
    println(cats)
}

fun TestMapIndexed(): Unit {
    println("mapIndexed")
    println(dogs)
    val cats = dogs.mapIndexed { index, dog ->
        val number = if(index % 2 == 0) 0 else 1
        Cat("${dog.name}-$number")
    }
    println(cats)
}
//-- Retire tous les éléments nuls
/*fun TestMapNotNull(): Unit {
    println("mapNotNull")
    println(dogs)
    val cats = dogs.mapNotNull { it?.name?.let { Cat(it) } }
    println(cats)
}*/

/*** 4.3.1 */
fun TestMutableMapOf(): Unit {
    val persons = mutableMapOf("Sylvie" to Gender.WOMAN, "Ludovic" to Gender.MAN)
    println(persons)

    /*** 4.3.2 */
    println()
    persons.put(key = "Marc", Gender.MAN)
    persons["Charlotte"] = Gender.WOMAN
    /*** 4.2.2*/
    for(person in persons) {
        println("${person.key} - ${person.value}")
    }
    println()
    /*** 4.2.3 */
    for(key in persons.keys){
        println(key)
    }
    println()
    /*** 4.2.4 */
    for(value in persons.values){
        println(value)
    }
    println()
    /*** 4.2.5 */
    println(persons["Ludovic"])
    println(persons.getOrDefault("Sylvie", "Unknown élément"))
    println(persons.getOrElse("Robert"){ "Unknown élément" })

    /*** 4.3.3-4.3.4 */
    println()
    val genderOfJean = persons.remove(key = "Ludovic")
    val isCharlotteAsWomanRemoved = persons.remove(key = "Charlotte", value = Gender.WOMAN)

    println("$genderOfJean \n$isCharlotteAsWomanRemoved \n$persons")
}