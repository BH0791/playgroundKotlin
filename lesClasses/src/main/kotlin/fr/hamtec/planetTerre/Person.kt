package fr.hamtec.planetTerre

class Person(
    name: String,
    surname: String,
    age: Int,
    var isEmployed: Boolean = true
) : HomoSapiens(name, surname, age, species = "Bipedalism", "unknown", 0f, 0.0) {

    //-Plus simple
    fun getFullName() = "$name $surname"

    //-Ancienne méthode java
    fun getFullNameAncienne(): String {
        return "$name $surname $age an(s) $species $sex $weight $isEmployed $size "
    }
}