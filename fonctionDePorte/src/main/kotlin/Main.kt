package fr.hamtec

import fr.hamtec.bo.Person

fun main() {
    println("Hello fonction de portée!")

    fonctionEtenduLet()

}
private fun fonctionEtenduLet() {
    Person("Alice", 20).let {
        println(it)
        it.name = "Joe"
        it.age = 50
        println(it)
    }
}
private fun objetApply(){
    val person = Person().apply {
        name = "Ram"
        age = 30
    }
    println(person)
}
private fun porteeTemporaire(){
    val nullableValue: Int? = 42

    nullableValue?.let {
        // Operations performed inside the let block
        val doubledValue = it * 2
        println("Doubled Value: $doubledValue")
    }
}
private fun chaineDeCharacter(){
    val originalString: String? = "Hello, World!"

    val result = originalString?.let {
        // ** Effectuer des manipulations de chaînes de caractères à l'intérieur du bloc let
        val result = it.uppercase()
        result
    }

    // Printing the result
    println("Original: $originalString")
    println("Modified: $result")
}