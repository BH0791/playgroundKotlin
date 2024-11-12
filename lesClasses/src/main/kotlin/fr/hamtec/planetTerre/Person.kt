package fr.hamtec.planetTerre

class Person(
    val name: String,
    val surname: String,
    var age: Int,
    var isEmployed: Boolean = true
) {
    //+ Contrôle de l'age entre 0 et 100
    init {
        if (this.age in 0..100) {
            this.age = age
        } else {
            age = 0
        }
    }

    //-Plus simple
    fun getFullName() = "$name $surname"

    //-Ancienne méthode java
    fun getFullNameAncienne(): String {
        return "$name $surname $age an(s)"
    }
}