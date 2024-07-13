package fr.hamtec.bo

import kotlinx.coroutines.*

fun conVoke() {

    runBlocking {
        val parentJob = GlobalScope.launch{
            println("Parent coroutine")

            launch {
                println("First child coroutine")
                delay(1000L)
                println("End of first child coroutine")
            }

            launch(NonCancellable) {
                println("Second child coroutine")
                delay(1000L)
                println("End of second child coroutine")
            }

            println("End of parent coroutine")
        }

        parentJob.cancel()
    }

    Thread.sleep(1500)
    println("End of program")
}

