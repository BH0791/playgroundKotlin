package fr.hamtec

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import okio.FileSystem
import okio.Path.Companion.toPath
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.InputStream

fun main() {
    GlobalScopelaunchDemo()
}

private fun runBlockingDemo() {
    // + le thread principal attend que la coroutine à l’intérieur se termine en premier.
    // + Il existe des scénarios spécifiques dans lesquels vous souhaiterez peut-être exécuter une
    // + coroutine et attendre son résultat de manière bloquante. Par exemple, les tests et les fonctions
    // + principales sont des cas d’utilisation courants.
    println("Before coroutine")

    runBlocking {
        println("In coroutine: Before sleep")
        Thread.sleep(5_000) // ** 1s
        println("In coroutine: After sleep")
    }

    println("After coroutine")
}

private fun GlobalScopelaunchDemo() {

    println("Before coroutine")
    // + Lance une nouvelle coroutine sans bloquer le thread courant et renvoie une référence à la coroutine sous
    // + la forme d'un job. La coroutine est annulée lorsque le travail résultant est annulé.
    GlobalScope.launch {
        println("In coroutine: Before sleep")
        Thread.sleep(2_000) // ** 5s
        println("In coroutine: After sleep")
    }

    println("After coroutine + sleep:5")
    Thread.sleep(5_000) // ** 5s
}
fun lectureEcr(){
    val file = File("/app/logs/january.log")
    val reader = BufferedReader(FileReader(file, Charsets.UTF_8))
    reader.lines().forEach { println(it) }
}
fun lectureDemo(){
    // ** https://stacklima.com/lire-a-partir-de-fichiers-a-l-aide-de-inputreader-dans-kotlin/
    val inputStream: InputStream = File ("gfg.txt").inputStream()
    val inputString = inputStream.reader().use {it.readText()}
    println (inputString)
}