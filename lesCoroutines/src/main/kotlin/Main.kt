package fr.hamtec

import fr.hamtec.exoFlow.TestViewModel
import fr.hamtec.exoFlow.emitDataStateFlow
import fr.hamtec.exoFlow.emitDatasharedFlow
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collectLatest

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    println("Start program\n")
    emitDatasharedFlow()
//    emitDataStateFlow()
}
fun testFlow(){
    val viewModel = TestViewModel()
    runBlocking {
        launch() {
            viewModel.emitDataFlow().collect{ vas -> println(vas) }
        }
    }
}