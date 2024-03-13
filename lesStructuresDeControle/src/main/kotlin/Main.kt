package fr.hamtec

fun main() {
    println("********** Les structures de contrôle **********")

    

}
fun demo1() {
    println("https://www.youtube.com/watch?v=vhUMMYlPthU&list=PLT2KSPhMMiqroUEfg21lDO_AlOlADAfKC&index=2&ab_channel=DrcMind")
    //! Any => tous les types
    val age: Any = "14 ans"

    when(age){
        18 -> println("Vous avez 18 ans")
        0,1,2,3,4,5 -> println("Les valeurs 0,1,2,3,4,5")
        in 10..17 -> println("Entre [10 et 17]")
        is String -> println("Veuillez saisir l'âge das le bon format")
        else -> println("Ici c'est fini")
    }

    val couleur = "vert"

    val action = if(couleur == "rouge") "Arrêter"
    else if (couleur == "vert") "Continuer"
    else if (couleur == "jaune") "Ralentir"
    else "Couleur incorect"

    println(action)
}