package com.example.memorygame
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.memorygame.ui.theme.MemoryGameTheme







    @Composable
    fun MemoryGameScreen (
        modifier: Modifier = Modifier,
        viewModel: MemoryGameViewModel = MemoryGameViewModel()
    ){
        val state = viewModel.state.value
        Column(
            modifier = modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ){




            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier.fillMaxWidth()
            ) {
                MemoryGameButton(button = state.cards[0].display, ){viewModel.setButton(0)}
                MemoryGameButton(button = state.cards[1].display,){viewModel.setButton(1)}
                MemoryGameButton(button = state.cards[2].display, ){viewModel.setButton(2)}
                MemoryGameButton(button = state.cards[3].display, ){viewModel.setButton(3)}
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier.fillMaxWidth()
            ) {
                MemoryGameButton(button = state.cards[4].display, ){viewModel.setButton(4)}
                MemoryGameButton(button = state.cards[5].display,){viewModel.setButton(5)}
                MemoryGameButton(button = state.cards[6].display, ){viewModel.setButton(6)}
                MemoryGameButton(button = state.cards[7].display, ){viewModel.setButton(7)}

            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier.fillMaxWidth()
            ) {
                MemoryGameButton(button = state.cards[8].display, ){viewModel.setButton(8)}
                MemoryGameButton(button = state.cards[9].display,){viewModel.setButton(9)}
                MemoryGameButton(button = state.cards[10].display, ){viewModel.setButton(10)}
                MemoryGameButton(button = state.cards[11].display, ){viewModel.setButton(11)}

            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier.fillMaxWidth()
            ) {
                MemoryGameButton(button = state.cards[12].display, ){viewModel.setButton(12)}
                MemoryGameButton(button = state.cards[13].display,){viewModel.setButton(13)}
                MemoryGameButton(button = state.cards[14].display, ){viewModel.setButton(14)}
                MemoryGameButton(button = state.cards[15].display, ){viewModel.setButton(15)}

            }
            Row {
                Button(onClick = {
                    viewModel.resetGame()
                }) {
                    Text(
                        text = "resetGame",
                    )
                }
            }
        }
    }




    @Composable

    fun MemoryGameButton(
        button:String,

        onClick:() -> Unit,
    ) {

        Button(
            onClick = onClick,


        )
        {
            Text(text = button, fontSize = 50.sp
            )
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun MemoryPreview() {

        MemoryGameTheme {
            MemoryGameScreen()
        }
    }

