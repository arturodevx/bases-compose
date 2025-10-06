package com.arturocode.myapp.ui.states

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true, device = Devices.PIXEL_3)
@Composable
fun MyState(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
    /*
    it is used for when you want to prevent the state from
    restarting when there is an orientation change on the device
     */
    //var number by rememberSaveable { mutableIntStateOf(0) }
        var number by remember { mutableIntStateOf(0) }
        Text(
            "Click me: $number",
            modifier = Modifier.clickable {
                number += 1
            }, fontSize = 24.sp
        )

        Button(onClick = { number = 0 }) {
            Text("Reset")
        }
    }

}