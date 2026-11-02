package com.felipe.buscadordecep.ui.theme.componentes

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.felipe.buscadordecep.ui.theme.Teal700
import com.felipe.buscadordecep.ui.theme.WHITE

@Composable
fun CaixaTexto(
    value: String,
    onValueChage: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions
){
    OutlinedTextField(
        value,
        onValueChage,
        label = { Text(text = label )},
        colors = TextFieldDefaults.colors(
            focusedTextColor = Teal700,
            cursorColor = Teal700,
            focusedIndicatorColor = Teal700,
            focusedContainerColor = WHITE,
            unfocusedContainerColor = WHITE
        ),
        modifier = modifier,
        keyboardOptions = keyboardOptions,
        maxLines = 1)
}