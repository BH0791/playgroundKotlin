package fr.hamtec.bo

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun premierFlow(): Unit {

    runBlocking {

        val flow: Flow<Int> = flow {
            for(i in 1..3) {
                println("<- Sending the value to ${i}")
                emit(i)
                delay(1000L)
            }
        }
        //*
        launch {
            flow.collect {
                delay(1000)
                println("-> Receiving the value from ${it}")
            }
        }

    }


}

fun envoieFlow(): Unit {
    runBlocking {
        val flow: Flow<Int> = flow {
            for(i in 1..3) {
                println("<- Sending the value to ${i}")
                emit(i)
                delay(1000L)
            }
        }
    }
}

fun envoieChannel(): Unit {
    runBlocking {
        val channel = Channel<Int>()

        launch(newSingleThreadContext("Emeteur_1")) {
            for(i in 1..5) {
                println("<- Sending-1 the value $i")
                channel.send(i)
            }
            channel.close()
        }
    }
}

fun envoieMulti() {

    runBlocking {
        val flow = flow {
            (0..3).forEach { valeur ->
                println("<- Sending the value $valeur")
                emit(valeur)
                delay(3000L)
            }
        }
        //*
        launch {
            flow.collect{
                println("-> #1 Received the value $it")
            }
        }
        //*
        launch {
            flow.collect{
                println("-> #2 Received the value $it")
            }
        }

    }

}