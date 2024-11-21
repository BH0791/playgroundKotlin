package fr.hamtec.bo

data class Dog(val name: String) {
    val tatoo by lazy { "$name-123" }
}
