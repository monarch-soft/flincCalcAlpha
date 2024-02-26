package com.example.flinccalculatoralpha.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedTextFieldFl(
    value: String,
    onValueChange: (String) -> Unit,
    label: String= "",
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = { newValue->
            onValueChange.invoke(newValue)
        },
        label = { Text(text = label) },
        placeholder = {Text(text=label)},
        modifier = modifier,
        singleLine = true
    )
}
