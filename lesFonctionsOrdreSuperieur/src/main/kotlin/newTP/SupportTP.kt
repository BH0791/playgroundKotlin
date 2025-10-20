package fr.hamtec.newTP

fun testTP(): Unit {

    val personne = Personne()
//    println(personne.nom)
//    println(personne.postnom)
//    depersonne(personne, ::recupNom)

//    depersonne(personne, { nom ->
//        val nomMajuscule = nom.uppercase()
//        println(nomMajuscule)
//    })

    depersonne(
        personne
    ) {
        val nomMajuscule = it.uppercase()
        println(nomMajuscule)
    }

    personne.getNomComplet {
        println(it.uppercase())
    }
}

fun depersonne(
    personne: Personne,             //-1er  paramettre
    nomFonction: (String) -> Unit   //-2eme paramettre
) {
    nomFonction(personne.nom)       //-corps de la fonction
}

fun Personne.getNomComplet(fn: (String) -> Unit) {
    fn("${this.nom} et ${this.postnom}")
}

//fun recupNom(nom: String) {
//    println(nom)
//}