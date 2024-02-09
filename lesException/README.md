## Les exceptions en java c'est mieux!

Java prend en charge la capture de plusieurs exceptions dans un bloc catch, par exemple :

```
// Java code
try {
// ...
} catch (Exception1 | Excpetion2 ex) {
// Perform some common operations with ex
}
```

Cependant, Kotlin n’a pas pris en charge cette fonctionnalité jusqu’à la version actuelle (1.9.22). Ainsi, nous allons explorer comment implémenter la fonctionnalité « multi-catch » dans Kotlin.

```
// Kotlin
        try {
            val result = Integer.parseInt("2")
            println (result)
        } catch (exe: ArithmeticException) {
            println("Erreur! => ${exe.message}")
        }catch (exe: NumberFormatException){
            println("Erreur! => ${exe.message}")
        }
```

Et pour avoir une version qui ressemble au multi-catch
```
try {
            val result = 12/Integer.parseInt("A")
            println (result)
        } catch (exe: Exception) {
            when(exe){
                is ArithmeticException -> println("${exe.message}")
                is NumberFormatException -> println("${exe.message}")
                exe -> println("Impossible")
            }
        }
```
*kotlin-stdlib / kotlin*<br>
**Throwable :** Classe de base pour toutes les erreurs et exceptions. Seules les instances de cette classe peuvent être lancées ou capturées.

open class **Throwable**<br>
|-open class Error : Throwable<br>
|-open class Exception : Throwable<br>
|-open class RuntimeException : Exception<br>
|-open class CharacterCodingException : Exception<br>
|-class NoSuchPropertyException : Exception<br>
|-class IllegalPropertyDelegateAccessException : Exception<br>
|-class IllegalCallableAccessException : Exception<br>
|-class ForeignException : Exception<br>
