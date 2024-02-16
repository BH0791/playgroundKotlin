package fr.hamtec

import kotlinx.coroutines.*

fun main() {
    println("Start program")

    runBlocking {
        //println("Coroutine runBlocking +++++")

        val parentJob = GlobalScope.launch {

            println("Parent coroutine")
            launch {
                println("First child coroutine ")
                delay(1000)
                println("End of first child coroutine ")
            }
            launch(NonCancellable) {
                println("Second child coroutine ")
                delay(1000)
                println("End of second child coroutine ")
            }
            println("End of parent coroutine")
        }
        parentJob.cancel()
        //println("End coroutine runBlocking +++++")
    }
    Thread.sleep(1500)
    println("End of program")

}
fun addObjectTypeJob(){
    println("Start program")

    runBlocking {
        //println("Coroutine runBlocking +++++")

        val parentJob = GlobalScope.launch {

            println("Parent coroutine")
            launch {
                println("First child coroutine ")
                delay(1000)
                println("End of first child coroutine ")
            }
            launch(NonCancellable) {
                println("Second child coroutine ")
                delay(1000)
                println("End of second child coroutine ")
            }
            println("End of parent coroutine")
        }
        parentJob.cancel()
        //println("End coroutine runBlocking +++++")
    }
    Thread.sleep(1500)
    println("End of program")
}

fun gestionCentralisee() {
    println("==> Start program")

    runBlocking {

        val parentJob = GlobalScope.launch(CoroutineExceptionHandler { _, throwable ->
            println("An error occured while executing the coroutine : ${throwable.message}")
        })

        {

            println("Parent coroutine runBlocking +++++")

            launch {
                println("First child coroutine ")
                delay(1000)
                println("End of first child coroutine ")
            }
            launch {
                println("Second child coroutine ")
                50 / 0
                println("End of second child coroutine ")
            }


        }
        println("End of parent coroutine runBlocking +++++")
        parentJob.join()
    }

    println("End of program")
}

fun coroutineRunCatching() {
    println("Start program")

    runBlocking {
        println("Parent coroutine runBlocking +++++")


        launch {
            println("First child coroutine ")
            delay(1000)
            println("End of first child coroutine ")
        }
        launch {
            println("Second child coroutine ")
            delay(1000)
            val result = runCatching {
                50 / 0
            }
            println("End of second child coroutine with success ? ${result.isSuccess}")
            println("End of second child coroutine with Failure ? ${result.isFailure}")

            println("End of second child coroutine ")
        }

        println("End of parent coroutine runBlocking +++++")
    }

    println("End of program")
}

fun coroutineTryCath() {
    println("Start program")

    runBlocking {
        println("Parent coroutine runBlocking +++++")


        launch {
            println("First child coroutine ")
            delay(1000)
            println("End of first child coroutine ")
        }
        launch {
            println("Second child coroutine ")
            delay(1000)
            try {
                50 / 0
            } catch (exe: Exception) {
                println("Gestion des exception avec le message : ${exe.message}")
            }

            println("End of second child coroutine ")
        }

        println("End of parent coroutine runBlocking +++++")
    }



    println("End of program")
}

fun coroutineParentEnfant() {
    println("Start program")

    runBlocking {
        println("Parent coroutine runBlocking +++++")

        val job = GlobalScope.launch {
            println("Parent coroutine GlobalScope.launch -----")

            launch {
                println("First child coroutine *+*+*")
                delay(1000)
                println("End of first child coroutine *+*+*")
            }
            launch {
                println("Second child coroutine *****")
                delay(1000)
                println("End of second child coroutine *****")
            }
            println("End of parent coroutine GlobalScope.launch -----")
        }
        job.cancel()
        println("End of parent coroutine après job.cancel() +++++")
    }

    println("End of program")
}

fun coroutineDansUnCoroutinev1() {
    println("Avant la coroutine runBlocking")

    runBlocking {
        println("Parent coroutine runBlocking")
        launch {
            println("First child coroutine")
            delay(1000)
            println("End of first child coroutine")
        }
        launch {
            println("Second child coroutine")
            delay(1000)
            println("End of second child coroutine")
        }
        println("End of parent coroutine runBlocking")
    }

    println("Après la coroutine runBlocking")
}

fun coroutineDansUnCoroutinev2() {

}

fun annulerUneCoroutine() {
    println("Avant la coroutine")

    runBlocking {

        val apiJob = launch {
            println("Dans la 1er coroutine avant le sleep...")
            //callAPI()
            println("Dans la 1er coroutine après le sleep...")
        }
        launch {
            println("Dans la 2éme coroutine avant le sleep et le cancel...")
            delay(1_000)
            apiJob.cancel()
            println("Dans la 2éme coroutine après le sleep et cancel...")
        }
        apiJob.join()
        println("The API has been cancelled ? ${apiJob.isCancelled}")

    }

    println("Après la coroutine")
}

suspend fun callAPI(): String {
    println("Dans la méthode callAPI")
    delay(10_000)
    return "The result"
}

fun courtineLaunchJobSimple() {
    println("Avant la coroutine")

    val job = GlobalScope.launch {
        println("Dans la coroutine avant le sleep...")
        delay(3000)
        println("Dans la coroutine après le sleep...")
    }

    runBlocking {
        job.join()
    }

    println("Après la coroutine")
}

fun coroutineRunBlockingSimple() {
    println("Avant la coroutine")

    runBlocking {

        println("Dans la coroutine... Avant la pause...")
        delay(2000)
        println("Dans la coroutine... Après la pause...")
    }

    println("Après la couroutine")
}


