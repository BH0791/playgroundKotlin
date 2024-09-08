enum class Gender {
    WOMAN, MAN
}
fun simpleMap(): Unit {
/*
        Pour initialiser un MutableMap vide en Kotlin, vous pouvez utiliser la fonction mutableMapOf().
        Voici un exemple simple : val mapAp: MutableMap<String, Int> = mutableMapOf()
        Cela crée un MutableMap vide où les clés sont de type String et les valeurs de type Int. Vous pouvez
        ensuite ajouter des éléments à cette map comme ceci :
        map["clé1"] = 1
        map["clé2"] = 2

 */
    val mapAp: MutableMap<String, Int> = mutableMapOf()
    val persons = mutableMapOf<String, Gender>()
    val myMap = mutableMapOf(
            "one" to 1,
            "two" to 2,
            "three" to 3
    )
    println("hello $mapAp")
    persons.put("Luc", Gender.MAN)
    displayPersons(persons)

    ajouterPersons(persons)
    println("---")
    println(persons)
}

fun displayPersons(persons: MutableMap<String, Gender>) {
    persons.forEach { key, value -> println("Clé: $key - Valeur: $value") }
}

fun ajouterPersons(persons: MutableMap<String, Gender>): MutableMap<String, Gender> {
    persons.put("Lucy", Gender.WOMAN)
    persons.put("Marc", Gender.MAN)
    return persons
}
