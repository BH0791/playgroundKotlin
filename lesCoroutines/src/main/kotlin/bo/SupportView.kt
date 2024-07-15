package fr.hamtec.bo

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.AbstractFlow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.flow

val recep = ViewFlow()

 fun flowTest_1(){
     runBlocking {
         val flow = recep.simple()
         println("Calling collect...")
         flow.collect{value -> println(value)}
         println("Calling collect again...")
         flow.collect{value -> println(value)}
     }
}
fun flowTest_2(){
    runBlocking(Dispatchers.Default) {
        launch {
            recep.emeteur.collect{
                print("\r$it")
            }
        }
    }
}
fun supSimple(){
    runBlocking {
        recep.simple().collect{value -> println(value) }
    }
}
suspend fun flowOfInt(listOfBoolean: List<Int>) = flow {
    listOfBoolean.forEach {
        delay(1000)
        emit(it)
    }
}
fun testFlowOfInt(){
    runBlocking {
        flowOfInt(listOf(1, 2, 3, 4, 5)).collect {
            println("VALUE COLLECTED: $it")
        }
    }
}
class FlowExample(private val listOfBoolean: List<Int>): AbstractFlow<Int>() {
    override suspend fun collectSafely(collector: FlowCollector<Int>) {
        listOfBoolean.forEach {
            delay(1000)
            collector.emit(it)
        }
    }
}
fun testFlowExample(){
    runBlocking {
        FlowExample(listOf(1, 2, 3, 4, 5)).collect {
            println("VALUE COLLECTED: $it")
        }
    }
}