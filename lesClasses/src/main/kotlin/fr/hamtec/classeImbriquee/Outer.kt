package fr.hamtec.classeImbriquee

class Outer {
    private val bar: Int = 1

    inner class Inner {
        fun foo() = bar
    }

    fun debug() = this.toString()

}

