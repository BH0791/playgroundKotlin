package fr.hamtec.bo

data class Dog(val name: String) {
    lateinit var tatoo: String
        private set

    fun generateTatoo() {
        tatoo = "$name-123"
    }
}
