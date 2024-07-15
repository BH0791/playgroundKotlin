package fr.hamtec.bo

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun simpleChannel() {
    runBlocking {

        val channel = Channel<Int>(3)

        launch(newSingleThreadContext("Emeteur")) {
            for(i in 1..3){
                println("Sending the value $i")
                channel.send(i)
                delay(1000)
            }
        }

        launch(newSingleThreadContext("Recepteur")) {
            val dataReceived = channel.receive()
            println("Receiving the value $dataReceived")
        }

    }
    println("\nEnd of program")
}
