package fr.hamtec.bo

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun simpleChannel() {
    runBlocking {

        val channel = Channel<Int>(3)

        launch(newSingleThreadContext("Emeteur")) {
            for(i in 1..3) {
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

fun simpleChannel2() {
    runBlocking {

        val channel = Channel<Int>(3)

        launch(newSingleThreadContext("Emeteur")) {
            for(i in 1..3) {
                println("Sending the value $i")
                channel.send(i)
                delay(1000)
            }
        }

        launch(newSingleThreadContext("Recepteur")) {
            repeat(3) {
                val dataReceived = channel.receive()
                println("Receiving the value $dataReceived")
            }
        }

    }
    println("\nEnd of program")
}

fun simpleChannel3() = runBlocking {

        val channel: Channel<Int> = Channel<Int>(Channel.UNLIMITED)

        launch(newSingleThreadContext("Emeteur_1")) {
            for(i in 1..5) {
                channel.send(i)
                println("Sending-1 the value $i")
            }
        }

        launch(newSingleThreadContext("Emeteur_2")) {
//            channel.consumeEach {dataReceived ->
//                delay(1000)
//                println("Receiving-3 the value $dataReceived")
//            }
            for(j in 1..5) {
                channel.send(j)
                println("Sending-2 the value $j")
            }

        }

        launch(newSingleThreadContext("Recepteur_1")) {
            channel.consumeEach { dataReceived ->
                delay(1000)
                println("#1 Receiving the value $dataReceived")
            }

        }

        launch(newSingleThreadContext("Recepteur_2")) {
            channel.consumeEach { dataReceived ->
                delay(1000)
                println("#2 Receiving the value $dataReceived")
            }
        }
        channel.close()


    }

