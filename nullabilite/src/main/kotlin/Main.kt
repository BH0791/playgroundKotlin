package fr.hamtec

fun main() {
    println("+++++++++++++++++++++++++Les types nullable+++++++++++++++++++++++++++++++++++")
    val valeurNonNull: String? = "valeurNonNull"
    val valeurNull: String? = null




    if (valeurNonNull != null) {
        println("Valeur non null")
        println(valeurNonNull.uppercase())
    }else{
        println("Valeur null")
    }

    println(valeurNull?.uppercase())

    valeurNonNull?.let {
        //? s'execute que si valeurNonNull
        println(it)
    }

    println(valeurNull ?: "-- Valeur null --")

    //? Declenche une erreur
    println(valeurNull!!.uppercase())


}