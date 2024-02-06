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

    dePersonne(personne1,  ::recupererNom )

    dePersonne(personne1,  { recupererNom(personne1.prenom) } )

    dePersonne(personne1, { nom ->
        val nomMajuscule = nom.uppercase()
        println("$nomMajuscule")
    })
    dePersonne(personne1, {
        val nomMajuscule = it.uppercase()
        println("$nomMajuscule")
    })
    dePersonne(personne1) {
        val nomMajuscule = it.uppercase()
        println("$nomMajuscule")
    }
    println(personne1.getNomComplet())
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
    return "[${this.name}-${this.prenom}]"
}