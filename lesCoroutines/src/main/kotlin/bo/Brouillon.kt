package fr.hamtec.bo

import kotlinx.coroutines.*

fun conVoke() {

    runBlocking {
        val parentJob = GlobalScope.launch(CoroutineExceptionHandler { _, throwable ->
            println("An error occured while executing the coroutine ${throwable.message}")
        }) {
            println("Parent coroutine")

            launch {
                println("First child coroutine")
                delay(1000L)
                println("End of first child coroutine")
            }

            launch {
                println("Second child coroutine")
                50 / 0
                println("End of second child coroutine")
            }

            println("End of parent coroutine")
        }

        parentJob.join()
    }
    println("End of program")
}

