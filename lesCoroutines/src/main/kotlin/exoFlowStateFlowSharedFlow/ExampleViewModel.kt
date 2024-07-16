package fr.hamtec.exoFlowStateFlowSharedFlow

import kotlinx.coroutines.flow.*

class ExampleViewModel {
    private val _mutableSharedFlow: MutableSharedFlow<Int> = MutableSharedFlow<Int>()
    // Represents this mutable shared flow as a read-only shared flow.
    val sharedFlow: SharedFlow<Int> = _mutableSharedFlow.asSharedFlow()

    private val _mutableStateFlow: MutableStateFlow<Int> = MutableStateFlow(0)
    // Represents this mutable state flow as a read-only state flow.
    val stateFlow: StateFlow<Int> = _mutableStateFlow.asStateFlow()
}