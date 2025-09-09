package com.example.moviecounter.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ComponentTwo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .background(Color(0xFF03DAC5)), // color de fondo turquesa
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Componente Dos",
            color = Color.Black,
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Italic
        )
    }
}
