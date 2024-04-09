package com.derandecker.colorappv1.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.derandecker.colorappv1.ChosenColor

class MainViewModel : ViewModel() {

    val backgroundColor = mutableStateOf(Color(0xFFFFFFFF))

    fun changeBackgroundColor(chosenColor: ChosenColor) {
        if (chosenColor == ChosenColor.RED) {
            backgroundColor.value = Color(0xFFFF0000)
        }
        if (chosenColor == ChosenColor.BLUE) {
            backgroundColor.value = Color(0xFF0000FF)
        }
        if (chosenColor == ChosenColor.GREEN) {
            backgroundColor.value = Color(0xFF00FF00)
        }
        if (chosenColor == ChosenColor.YELLOW) {
            backgroundColor.value = Color(0xFFFFFF00)
        }
        if (chosenColor == ChosenColor.PURPLE) {
            backgroundColor.value = Color(0xFFA020F0)
        }
//        if (chosenColor == ChosenColor.WHITE) {
//            backgroundColor.value = Color(0xFFFFFFFF)
//        }
    }
}
