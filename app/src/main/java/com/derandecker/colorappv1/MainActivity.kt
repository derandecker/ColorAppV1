package com.derandecker.colorappv1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.derandecker.colorappv1.ui.theme.ColorAppTheme
import com.derandecker.colorappv1.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColorAppTheme {
                MainScreen()
            }
        }
    }
}


@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val mainViewModel: MainViewModel = viewModel()
    val backgroundColor by mainViewModel.backgroundColor

    val radioOptions = ChosenColor.entries.toTypedArray()

    val selectedValue = remember { mutableStateOf(radioOptions[0]) }
    val isSelectedItem: (ChosenColor) -> Boolean = { selectedValue.value == it }
    val onChangeState: (ChosenColor) -> Unit = { selectedValue.value = it }
    Column(
        modifier = Modifier
            .padding(top = 16.dp, start = 16.dp)
            .background(backgroundColor)
            .fillMaxSize()
    ) {
        Text(
            text = "Practicing Kotlin with Colors",
            modifier = modifier
        )
        radioOptions.forEach { color ->
            Row(
                Modifier
                    .fillMaxWidth()
//                    .selectable(
//                        selected = (text == selectedOption),
//                        onClick = {
//                        onChangeState(color)
//                        mainViewModel.changeBackgroundColor(selectedValue.value)
//                        }
//                    )
                    .padding(horizontal = 16.dp)
            ) {
                RadioButton(
                    modifier = Modifier.align(Alignment.CenterVertically),
                    selected = isSelectedItem(color),
                    onClick = {
                        onChangeState(color)
                        mainViewModel.changeBackgroundColor(selectedValue.value)
                    }
                )
                Text(
                    text = color.toString(),
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .align(Alignment.CenterVertically)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainScreenPreview() {
    ColorAppTheme {
        MainScreen()
    }
}
