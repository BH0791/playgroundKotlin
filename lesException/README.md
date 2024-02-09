## Les exceptions

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