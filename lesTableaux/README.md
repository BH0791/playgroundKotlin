## Les tableaux

class Array\<T><br>
Représente un tableau (plus précisément un tableau Java lorsqu'il s'agit de la plate-forme JVM). Les instances de tableau peuvent être créées à l'aide des fonctions arrayOf, arrayOfNulls et emptyArray de la bibliothèque standard. Voir la documentation du langage Kotlin pour plus d'informations sur les tableaux.

### Primitive
- class ByteArray
- class CharArray
- class ShortArray
- class IntArray
- class LongArray
- class DoubleArray
- class FloatArray

### Générique
- arrayOfNulls
```
fun <reified T> arrayOfNulls(size: Int): Array<T?>
fun <T> arrayOfNulls(size: Int): Array<T?>

```
- arrayof
```
fun <reified T> arrayOf(vararg elements: T): Array<T>
fun <T> arrayOf(vararg elements: T): Array<T>
```
- emptyArray
```
fun <reified T> emptyArray(): Array<T>
fun <T> emptyArray(): Array<T>
```
<br>

Méthodes de la class Array\<T><br><br>

jointToString<br>
Crée une chaîne de caractères à partir de tous les éléments séparés par un séparateur et en utilisant le préfixe et le postfixe fournis.
```

fun <T> Array<out T>.joinToString(
    separator: CharSequence = ", ",
    prefix: CharSequence = "",
    postfix: CharSequence = "",
    limit: Int = -1,
    truncated: CharSequence = "...",
    transform: ((T) -> CharSequence)? = null
): String
```
contentToString<br>
Renvoie une représentation sous forme de chaîne de caractères du contenu du tableau spécifié, comme s'il s'agissait d'une liste.
```
fun <T> Array<out T>?.contentToString(): String
fun ByteArray?.contentToString(): String
fun ShortArray?.contentToString(): String
fun IntArray?.contentToString(): String
fun LongArray?.contentToString(): String
fun FloatArray?.contentToString(): String
fun DoubleArray?.contentToString(): String
fun BooleanArray?.contentToString(): String
fun CharArray?.contentToString(): String
```