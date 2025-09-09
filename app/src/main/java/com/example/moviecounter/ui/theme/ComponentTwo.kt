package com.example.moviecounter.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ComponentTwo() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Componente 2", fontSize = 18.sp)
    }
}
