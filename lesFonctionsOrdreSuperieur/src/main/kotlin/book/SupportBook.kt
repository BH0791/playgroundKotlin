package fr.hamtec.book

fun appFDP(): Unit {
    //! Exemple d'un livre mais il est pas complet
//    println("Fonction d'ordre supèrieur")
//    displayTextInLambda { println("Je suis une fonction") }
//    doOperation(5,6, { a, b ->
//        println("a=$a")
//        println("b=$b")
//        a * b})
//    println(doOperation(2,2, ::caca))

    //! Evolution des fonctions d'ordre supèrieur
    val personne1 = Personne("Dupond", "Didier")
//+ V1 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//+ l'opérateur :: fait référence a une classe ou a une méthode
//+ V1 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    dePersonne(personne1, ::recupererNom)

    dePersonne(personne1, { recupererNom(personne1.prenom) })
//+ V1 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    dePersonne(personne1, { nom ->
        val nomMajuscule = nom.uppercase()
        println("$nomMajuscule")
    })
//+ V2 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    dePersonne(personne1, {
        val nomMajuscule = it.uppercase()
        println("$nomMajuscule")
    })
//+ V3 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    dePersonne(personne1) {
        val nomMajuscule = it.uppercase()
        println("$nomMajuscule")
    }
//+ Va ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    println(personne1.getNomComplet())
//+ Vb ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    personne1.getNomComplet2 {
        println(it)
    }
    println("----------------------------------------------------------------")
    //? Appel de la fonction d'ordre supèrieur
    dePersonne(personne1, { recupererNom(personne1.name) })

    val resultat = { a: Int, b: Int -> "ba" }
    println(resultat(5, 8))
    println({ a: Int, b: Int -> "ba" })
}

fun displayTextInLambda(lambda: () -> Unit) {
    println("\nBefor lambda")
    lambda()
    println("After lambda")
}

fun doOperation(a: Int, b: Int, lambda: (Int, Int) -> Int) {
    println("\nBefor lambda")
    val result = lambda(a, b)
    println("Result : $result")
}

fun caca(a: Int, b: Int): Int {
    return a + b
}

//? Définition de la méthode que je vais donner à la fonction d'ordre supèrieur
fun recupererNom(nom: String) {
    println(nom)
}

//? Définition de la fonction d'ordre supèrieur
fun dePersonne(personne: Personne, fn: (String) -> Unit) {
    fn(personne.name)
}

//? Classe qui va servir a la démonstration de la classe d'ordre supèrieur
data class Personne(val name: String, val prenom: String)

//? Extention de la classe Personne

fun Personne.getNomComplet(): String {
    return "va-[${this.name}-${this.prenom}]"
}

fun Personne.getNomComplet2(fn: (String) -> Unit) {
    fn("vb-[${this.name}-${this.prenom}]")
}

