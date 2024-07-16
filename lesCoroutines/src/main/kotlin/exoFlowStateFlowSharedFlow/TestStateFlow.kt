package fr.hamtec.exoFlow

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

private val mutableStateFlow = MutableStateFlow(0)

//* Représente ce flux d'état mutable comme un flux d'état en lecture seule.
val stateFlow: StateFlow<Int> = mutableStateFlow.asStateFlow()

fun emitDataStateFlow() = runBlocking {

    // Update the state
    val job = launch(Dispatchers.Default) {

        for(i in 1..5) {
            mutableStateFlow.value = i
        }
        println("Job")

//        repeat(5) { i ->
//            mutableStateFlow.value = i
//        }
    }
//    job.cancel()

// Collect values from stateFlow
    val job1 = launch {
        stateFlow.collect { value ->
            println("Collector #1 received: $value")
        }
    }

// Collect values from stateFlow
    val job2 = launch {
        stateFlow.collect { value ->
            println("Collector #2 received: $value")
        }
    }



    println("Fin program")
    job.cancel()
}