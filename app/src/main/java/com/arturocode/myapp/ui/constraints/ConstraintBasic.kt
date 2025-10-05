package com.arturocode.myapp.ui.constraints

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun MyBasicLayout(modifier: Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (boxCyan, boxRed, boxMagenta, boxYellow, boxBlue, boxBlack, boxDarkGray, boxGreen, boxGray) = createRefs()

        Box(Modifier.size(75.dp)
            .background(Color.Gray)
            .constrainAs(boxGray){
                bottom.linkTo(boxDarkGray.bottom)
                start.linkTo(boxDarkGray.end)
                top.linkTo(boxDarkGray.top)
                end.linkTo(boxGreen.start)
            })

        Box(
            Modifier
                .size(155.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    bottom.linkTo(boxMagenta.top)
                    start.linkTo(boxMagenta.start)
                })

        Box(
            Modifier
                .size(155.dp)
                .background(Color.DarkGray)
                .constrainAs(boxDarkGray) {
                    bottom.linkTo(boxYellow.top)
                    end.linkTo(boxYellow.end)
                })

        Box(
            Modifier
                .size(155.dp)
                .background(Color.Black)
                .constrainAs(boxBlack) {
                    top.linkTo(boxBlue.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })

        Box(
            Modifier
                .size(75.dp)
                .background(Color.Cyan)
                .constrainAs(boxCyan) {
                    top.linkTo(boxBlue.bottom)
                    start.linkTo(boxBlue.end)
                })
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(boxBlue.bottom)
                    end.linkTo(boxBlue.start)
                })
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    bottom.linkTo(boxBlue.top)
                    start.linkTo(boxBlue.end)
                })

        Box(
            Modifier
                .size(75.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    bottom.linkTo(boxBlue.top)
                    end.linkTo(boxBlue.start)
                })


        Box(
            Modifier
                .size(75.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                })
    }
}

@Preview(showSystemUi = true, showBackground = true, device = Devices.PIXEL_3)
@Composable
fun ShowPreview() {
    MyBasicLayout(modifier = Modifier)
}