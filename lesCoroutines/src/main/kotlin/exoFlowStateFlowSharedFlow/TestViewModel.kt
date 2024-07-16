package fr.hamtec.exoFlow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flow
import java.util.*

class TestViewModel {


    fun emitDataFlow(): Flow<Int> {
        return flow<Int> {
//            for(i in 1..5){
//                emit(Random().nextInt(100))
//            }

            repeat(5) {
                //println(Random().nextInt(100))
                emit(Random().nextInt(100))
                delay(1000)
            }
        }
    }
}