package fr.hamtec.exoFlowStateFlowSharedFlow

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow

class ExampleViewModel {
    private val _mutableSharedFlow = MutableSharedFlow<Int>()
    // Represents this mutable shared flow as a read-only shared flow.
    val sharedFlow = _mutableSharedFlow.asSharedFlow()

    private val _mutableStateFlow = MutableStateFlow(0)
    // Represents this mutable state flow as a read-only state flow.
    val stateFlow = _mutableStateFlow.asStateFlow()
}