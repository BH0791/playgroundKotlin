package fr.hamtec.bo

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.runBlocking

class ViewFlow {
//+ flowOn L’opérateur est très pratique lorsqu’il s’agit de contrôler le fil sur lequel la tâche sera effectuée.
    val emeteur = flow {
        (0..100).forEach { valeur ->
            //println("<-<-- Sending the value $valeur")
            emit(valeur)
            delay(10L)
        }
    }.flowOn(Dispatchers.Default)

    fun simple(): Flow<Int> = flow { // flow builder
        for (i in 1..3) {
            delay(1000) // pretend we are doing something useful here
            emit(i) // emit next value
        }
    }

}

