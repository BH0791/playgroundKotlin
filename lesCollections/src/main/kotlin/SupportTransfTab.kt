import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.*

fun envoieDonnees() {
    runBlocking {
        val tableaux = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)

        val flow: Flow<Int> = flow {
            for(result in tableaux) {
                delay(1000)
                emit(result)
            }

        }
        launch {
            var newTab: MutableList<Int> = mutableListOf();
            flow.collect {
                newTab.add(it)
                println(newTab)
            }


        }
    }

}

/**
 * La méthode mutableListOf() renvoie une liste vide de type MutableList, ce qui signifie que nous pouvons ajouter et supprimer des éléments dans la structure de données. Pour vérifier cela, vous pouvez invoquer la méthode add() ou remove() sur l’objet retourné.
 *
 * Exécutez le code ci-dessus et notez que la méthode isEmpty() renvoie true avant l’ajout d’un élément et false après l’ajout d’un élément, comme indiqué ci-dessous.
 */
fun methMutableEmptyListMutableListOf(): Unit {
    val mutableEmptyList: MutableList<String> = mutableListOf()
    println(mutableEmptyList.isEmpty())
    mutableEmptyList.add("I am the first element !")
    println(mutableEmptyList.isEmpty())
}

/**
 * La méthode arrayListOf() retourne une ArrayList vide, mais dans l’exemple précédent, nous retournons une MutableList. Comment est-ce possible?
 *
 * Dans la section d’introduction, nous avons mentionné que la MutableList est une List car elle hérite de l’interface List ; puisque ArrayList implémente l’interface List, nous pouvons retourner MutableList en utilisant la ArrayList.
 *
 * Une fois que nous avons accès à la liste mutable, nous pouvons invoquer la méthode isEmpty() pour vérifier si la méthode est vide. Exécutez le code ci-dessus et observez que les sorties sont comme indiqué ci-dessous.
 */
fun methMutableEmptyListArrayListOf(): Unit {
    val mutableEmptyList: MutableList<String> = arrayListOf()
    println(mutableEmptyList.isEmpty())
    mutableEmptyList.add("I am the first element !")
    println(mutableEmptyList.isEmpty())
}

/**
 * La classe LinkedList implémente l’interface List, qui nous aide à retourner une MutableList de type LinkedList.
 *
 * Le constructeur LinkedList() retourne une liste vide et s’applique aux constructeurs des autres structures de données qui implémentent l’interface List.
 *
 * Exécutez l’exemple ci-dessus et notez que la sortie imprime la même chose que les autres exemples. La sortie est illustrée ci-dessous.
 */
fun methMutableEmptyListLinkedList(): Unit {
    val mutableEmptyList: MutableList<String> = LinkedList();
    println(mutableEmptyList.isEmpty())
    mutableEmptyList.add("I am the first element !")
    println(mutableEmptyList.isEmpty())
}

/**
 * Comme vous l’avez noté dans les exemples précédents, nous spécifiions directement le type de retour que nous voulions, qui était la MutableList. Dans la section d’introduction, nous avons mentionné que toute implémentation de liste est supposée être modifiable si nous ne spécifions pas si nous voulons une liste en lecture seule.
 *
 * Cet exemple montre comment la MutableList est retournée implicitement en définissant une implémentation List sans indiquer le type de retour.
 *
 * Exécutez le code ci-dessus et notez que la méthode isEmpty() héritée de la classe AbstractCollection renvoie true avant l’ajout d’un élément et false après l’ajout d’un élément. La sortie est illustrée ci-dessous.
 */
fun methMutableEmptyListArrayListImplicite(): Unit {
    val mutableEmptyList  = ArrayList<String>()
    println(mutableEmptyList.isEmpty())
    mutableEmptyList.add("I am the first element !")
    println(mutableEmptyList.isEmpty())
}
/*
    nous avons appris à créer une MutableList vide en utilisant différentes approches, notamment : en utilisant la
    méthode mutableListOf(), en utilisant la méthode arrayListOf(), en utilisant le constructeur d’une structure de
    données et en utilisant le approche de déclaration implicite
 */
fun tester(tab: MutableList<Int>): MutableList<Int> {
    tab[0] = 200
    println(tab.javaClass.classes)
    return tab
}
