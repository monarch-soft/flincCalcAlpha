package com.example.flinccalculatoralpha.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedTextFieldD(
    value: String,
    onValueChange: (String) -> Unit,
    label: String= "",
) {
    OutlinedTextField(
        value = value,
        onValueChange = { newValue->
            onValueChange.invoke(newValue)
        },
        label = { Text(text = label) },
        placeholder = {Text(text=label)}
    )
}
