package fr.hamtec.planetTerre

class Person(
    val name: String,
    val surname: String,
    var age: Int
) {
    init {
        if (this.age in 0..100) {
            this.age = age
        } else {
            age = 0
        }
    }

    //    var name = "Name"
//        set(value) {
//            field = "Name: $value"
//        }
//    var surname = "Surname"

    fun getFullName() = "$name $surname"

    fun getFullNameAncienne(): String {
        return "$name $surname $age an(s)"
    }
}