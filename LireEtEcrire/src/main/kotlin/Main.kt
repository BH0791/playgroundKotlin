package fr.hamtec

import java.io.*
import java.nio.file.Files
import java.nio.file.Paths

fun main() {
    utilisationFileBufferedWriter()
}

fun utilisationFileWriteText() {
    /**
     * L'approche standard pour définir le contenu du fichier consiste à File.writeText() fonction. Les données sont encodées à l'aide de la valeur par défaut UTF-8 ou le jeu de caractères spécifié.
     */
    val file = File("LireEtEcrire\\src\\main\\resources\\foot.out")
    val text = "Ceci est un texte 2"

    file.writeText(text, Charsets.UTF_8)
}

fun utilisationPrintWriter() {
    /**
     * La PrintWriter est la classe recommandée qui nécessite l'écriture de caractères plutôt que d'octets.
     */
    val file = File("LireEtEcrire\\src\\main\\resources\\foot.txt")
    val text = "Some log…"

    PrintWriter(file, Charsets.UTF_8).use { it.print(text) }
}

fun utilisationFieNewBufferedWriter() {
    /**
     * La Files.newBufferedWriter() la fonction renvoie un BufferedWriter qui peut être utilisé pour écrire efficacement du texte dans le fichier.
     */
    val path = Paths.get("LireEtEcrire\\src\\main\\resources\\footSV.txt")
    val text = "Some log…"

    Files.newBufferedWriter(path, Charsets.UTF_8).use { it.write(text) }
}

fun utilisationOutputStreamWriter() {
    /**
     * Depuis FileOutputStream est destiné à écrire des flux d'octets, vous pouvez construire un OutputStreamWriter pour
     * écrire des flux de caractères. Pour gagner en efficacité, il est conseillé d'envelopper un BufferedWriter autour
     * de OutputStreamWriter.
     */
    val file = File("LireEtEcrire\\src\\main\\resources\\data.txt")
    val text = "Some text"

    FileOutputStream(file).use { fos ->
        OutputStreamWriter(fos, Charsets.UTF_8).use { osw ->
            BufferedWriter(osw).use { bf -> bf.write(text) }
        }
    }
}

fun utlisationFileWriter() {
    /**
     * La FileWriter est une classe pratique pour écrire des flux de caractères en utilisant le codage de caractères par
     * défaut. Nous pouvons l'utiliser comme :
     */
    val file = File("LireEtEcrire\\src\\main\\resources\\data3.txt")
    val text = "Some log…"

    FileWriter(file).use { it.write(text) }
}

fun utilisationFileBufferedWriter(){
    /**
     * Il est conseillé d'envelopper BufferedWriter autour de file writer car ses opérations d'écriture sont très coûteuses.
     * Nous pouvons le faire avec le File.bufferedWriter() fonction, qui retourne un nouveau BufferedWriter pour écrire
     * le contenu de ce fichier.
     */
    val file = File("LireEtEcrire\\src\\main\\resources\\data3.txt")
    val text = "Some log…"

    file.bufferedWriter().use { bw -> bw.write(text) }
}