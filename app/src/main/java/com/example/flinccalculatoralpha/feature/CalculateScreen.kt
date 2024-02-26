package com.example.flinccalculatoralpha.feature

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.flinccalculatoralpha.R
import com.example.flinccalculatoralpha.components.FilledButtonFl
import com.example.flinccalculatoralpha.components.OutlinedTextFieldD
import com.example.flinccalculatoralpha.components.Title
import com.example.flinccalculatoralpha.navigation.Screens

@Composable
fun CalculateScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val propertyPrice = remember {
            mutableStateOf("")
        }

        val loanAmount = remember {
            mutableStateOf("")
        }

        Row (horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Title(title = stringResource(id = R.string.transfer_and_bond_cost_calculator))
            IconButton(onClick = { navController.popBackStack()}) {
                Icons.Filled.ArrowBack
            }
        }
        Spacer(modifier = Modifier.size(16.dp))
        OutlinedTextFieldD(value = propertyPrice.value, onValueChange = {price -> propertyPrice.value = price}, label = stringResource(id = R.string.property_purchase_price))
        Spacer(modifier = Modifier.size(16.dp))
        OutlinedTextFieldD(value = loanAmount.value, onValueChange = {loan -> loanAmount.value = loan }, label = stringResource(id = R.string.loan_amount))
        Spacer(modifier = Modifier.size(16.dp))
        FilledButtonFl(
            onClick = {
                      navController.navigate(Screens.summaryScreen)
            },
            label = stringResource(id = R.string.calculate))
    }
}