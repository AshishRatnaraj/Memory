package com.example.memorygame

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MemoryGameViewModel: ViewModel() {
    private val _state = mutableStateOf(MemoryGameState())
    val state: State<MemoryGameState> = _state



    fun setButton(buttonId: Int) {
        val cards =state.value.cards.copyOf()
       cards[buttonId].flipCard()
    }


    fun resetGame() {
        _state.value = MemoryGameState()
    }
}
