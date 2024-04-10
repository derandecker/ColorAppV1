package com.derandecker.colorappv1.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.derandecker.colorappv1.ChosenColor

class MainViewModel : ViewModel() {

    val backgroundColor = mutableStateOf(Color(0xFFFFFFFF))

    fun changeBackgroundColor(chosenColor: ChosenColor) {

        backgroundColor.value = when (chosenColor) {
            ChosenColor.RED -> Color(0xFFFF0000)
            ChosenColor.BLUE -> Color(0xFF0000FF)
            ChosenColor.GREEN -> Color(0xFF00FF00)
            ChosenColor.YELLOW -> Color(0xFFFFFF00)
            ChosenColor.PURPLE -> Color(0xFFA020F0)
            ChosenColor.WHITE -> Color(0xFFFFFFFF)
        }

//
//        if (chosenColor == ChosenColor.RED) {
//            backgroundColor.value = Color(0xFFFF0000)
//        }
//        if (chosenColor == ChosenColor.BLUE) {
//            backgroundColor.value = Color(0xFF0000FF)
//        }
//        if (chosenColor == ChosenColor.GREEN) {
//            backgroundColor.value = Color(0xFF00FF00)
//        }
//        if (chosenColor == ChosenColor.YELLOW) {
//            backgroundColor.value = Color(0xFFFFFF00)
//        }
//        if (chosenColor == ChosenColor.PURPLE) {
//            backgroundColor.value = Color(0xFFA020F0)
//        }
////        if (chosenColor == ChosenColor.WHITE) {
////            backgroundColor.value = Color(0xFFFFFFFF)
////        }

//        when (chosenColor) {
//            ChosenColor.RED -> backgroundColor.value = Color(0xFFFF0000)
//            ChosenColor.BLUE -> backgroundColor.value = Color(0xFF0000FF)
//            ChosenColor.GREEN -> backgroundColor.value = Color(0xFF00FF00)
//            ChosenColor.YELLOW -> backgroundColor.value = Color(0xFFFFFF00)
//            ChosenColor.PURPLE -> backgroundColor.value = Color(0xFFA020F0)
//            ChosenColor.WHITE -> backgroundColor.value = Color(0xFFFFFFFF)
//        }
//
//
//        backgroundColor.value = when (chosenColor) {
//            ChosenColor.RED -> Color(0xFFFF0000)
//            ChosenColor.BLUE -> Color(0xFF0000FF)
//            ChosenColor.GREEN -> Color(0xFF00FF00)
//            ChosenColor.YELLOW -> Color(0xFFFFFF00)
//            ChosenColor.PURPLE -> Color(0xFFA020F0)
//            ChosenColor.WHITE -> Color(0xFFFFFFFF)
//        }
    }
}
