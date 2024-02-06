package fr.hamtec

fun main() {
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
    dePersonne(personne1,  ::recupererNom )

    dePersonne(personne1,  { recupererNom(personne1.prenom) } )
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
    personne1.getNomComplet2{
        println(it)
    }
}
fun displayTextInLambda( lambda: () -> Unit ){
    println("\nBefor lambda")
    lambda()
    println("After lambda")
}
fun doOperation(a: Int, b: Int, lambda: (Int, Int) -> Int){
    println("\nBefor lambda")
    val result = lambda(a, b)
    println("Result : $result")
}
fun caca(a: Int, b: Int): Int {
    return a + b
}
fun recupererNom(nom: String){
    println(nom)
}
fun dePersonne(personne: Personne, fn: (String) -> Unit){
    fn(personne.name)
}

data class Personne(val name: String, val prenom: String)

//? Extention de la classe Personne

fun Personne.getNomComplet(): String {
    return "va-[${this.name}-${this.prenom}]"
}
fun Personne.getNomComplet2(fn: (String) -> Unit){
    fn("vb-[${this.name}-${this.prenom}]")
}