package fr.hamtec

fun main() {
    lanceDemo()
}

fun lanceDemo1(): Unit {
    val doOpAdd = { a: Int, b: Int ->
        a + b
    }

    println(doOpAdd(1, 2))
    doOperat(5, 2, doOpAdd)
}

fun doOperat(a: Int, b: Int, lambda: (a: Int, Int) -> Int) {
    println("Avant")
    println(lambda(a, b))
    println("Après")
}

fun lanceDemo(): Unit {
    val personne1 = Personn()
    personne1.getNomCople{
        println(it)
    }
    dePersonne(personne1, ::recupNom)
    dePersonne(personne1, { nom -> recupererNom(nom) })
    dePersonne(personne1, { nom ->
        val nomMaj = nom.uppercase()
        println(nomMaj)
    })
    dePersonne(personne1, {
        val nomMaj = it.uppercase()
        println(nomMaj)
    })
    dePersonne(personne1) {
        val nomMaj = it.uppercase()
        println(nomMaj)
    }
}

data class Personn(
    val nom: String = "John",
    val postname: String = "Dupond"
)

fun Personn.getNomCople(fn: (String)->Unit) {
    fn ("${this.nom} ${this.postname}")
}

fun recupNom(nom: String): Unit {
    println(nom)
}

fun dePersonne(personne: Personn, fn: (String) -> Unit): Unit {
    fn(personne.nom)
}

