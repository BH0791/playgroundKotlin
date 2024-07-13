package fr.hamtec

import kotlinx.coroutines.*

fun main() {
    println("Start program")

    runBlocking {

        val parentJob = GlobalScope.launch {

            println("Parent coroutine ++")
            launch() {
                println("First child coroutine ")
                delay(1000)
                println("End of first child coroutine ")
            }
            launch(SupervisorJob() + Dispatchers.IO + CoroutineExceptionHandler{
                _, throwable -> println("Failed to launch : ${throwable.message}")
            }) {
                println("Second child coroutine ")
                50/0
                println("End of second child coroutine ")
            }
            delay(1500)
            println("End of parent coroutine ++")
        }
        parentJob.join()
    }
    println("End of program")

}