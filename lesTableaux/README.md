## Les tableaux

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