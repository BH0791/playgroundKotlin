package fr.hamtec

interface Domestic {
    val tatoo: String

    fun lick(): Unit{
        println("[méthode non abstraite d'interface] Lick, lick")
    }
    fun snuggle()
}