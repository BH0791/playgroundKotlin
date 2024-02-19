package fr.hamtec

import java.io.File
import java.io.PrintWriter
import java.nio.charset.Charset

fun main() {
utilisationPrintWriter()
}
fun utilisationFileWriteText(){
    val file = File("LireEtEcrire\\src\\main\\resources\\foot.out")
    val text = "Ceci est un texte 2"

    file.writeText(text, Charsets.UTF_8)
}
fun utilisationPrintWriter(){
    val file = File("LireEtEcrire\\src\\main\\resources\\foot.txt")
    val text = "Some log…"

    PrintWriter(file, Charsets.UTF_8).use { it.print(text) }
}