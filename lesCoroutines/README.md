## Les coroutines
RunBlocking ?

Il existe des scénarios spécifiques dans lesquels vous souhaiterez peut-être exécuter une coroutine et attendre son résultat de manière bloquante. Par exemple, les tests et les fonctions principales sont des cas d’utilisation courants.
```
fun main() {
     runBlocking {
         println("Inside runBlocking")
     }
     println("Outside runBlocking")
}
```