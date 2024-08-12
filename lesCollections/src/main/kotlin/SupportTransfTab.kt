import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun envoieDonnees(){
    runBlocking {
        val tableaux = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13)

        val flow: Flow<Int> = flow {
            for(result in tableaux) {
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


fun tester(tab: MutableList<Int>): MutableList<Int> {
    tab[0] = 200
    println(tab.javaClass.classes)
    return tab
}
