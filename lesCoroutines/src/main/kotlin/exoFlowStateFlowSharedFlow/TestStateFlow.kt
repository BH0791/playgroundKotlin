package fr.hamtec.exoFlow

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

val mutableStateFlow = MutableStateFlow(0)
val stateFlow: StateFlow<Int> = mutableStateFlow

fun emitDataStateFlow() = runBlocking {

    // Update the state
    val job = launch(Dispatchers.Default) {

        for(i in 1..5){
            mutableStateFlow.value = i
        }

//        repeat(5) { i ->
//            mutableStateFlow.value = i
//        }
    }
    job.cancel()

// Collect values from stateFlow
    launch {
        stateFlow.collect { value ->
            println("Collector #1 received: $value")
        }
    }

// Collect values from stateFlow
    launch {
        stateFlow.collect { value ->
            println("Collector #2 received: $value")
        }
    }



}