package fr.hamtec.exoFlow

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//+ replay = le nombre de valeurs rejouées aux nouveaux abonnés (ne peut être négatif, valeur par défaut : zéro).
//+ extraBufferCapacity = le nombre de valeurs mises en mémoire tampon en plus du rejeu. emit n'est pas suspendu tant qu'il
//+      reste de l'espace tampon (facultatif, ne peut être négatif, zéro par défaut).
//+ onBufferOverflow = configure une action d'émission en cas de dépassement de tampon. Facultatif, il suspend par défaut
//+      les tentatives d'émission d'une valeur. Les valeurs autres que BufferOverflow.SUSPEND ne sont prises en charge
//+      que lorsque replay > 0 ou extraBufferCapacity > 0. Le débordement de la mémoire tampon ne peut se produire que
//+      lorsqu'au moins un abonné n'est pas prêt à accepter la nouvelle valeur. En l'absence d'abonnés, seules les valeurs
//+      de relecture les plus récentes sont stockées et le comportement de débordement de la mémoire tampon n'est jamais
//+      déclenché et n'a aucun effet.

private val _sharedFlow = MutableSharedFlow<Int>( replay = 1 )
//* Représente ce flux partagé mutable comme un flux partagé en lecture seule
val sharedFlow: SharedFlow<Int> = _sharedFlow.asSharedFlow()

fun emitDatasharedFlow() {
    runBlocking {

// Emit values to sharedFlow
        val job = launch {
            for(i in 1..15) {
                _sharedFlow.emit(i)
            }
        }

        // Collect values from sharedFlow
        launch {
            _sharedFlow.collect { value ->
                println("Collector 1 received: $value")
            }
        }

        // Collect values from sharedFlow
        launch {
            _sharedFlow.collect { value ->
                println("Collector 2 received: $value")
            }
        }


    }
}