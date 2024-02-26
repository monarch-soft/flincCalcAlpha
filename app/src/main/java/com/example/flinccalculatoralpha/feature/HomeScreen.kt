package com.example.flinccalculatoralpha.feature

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.flinccalculatoralpha.R
import com.example.flinccalculatoralpha.components.FilledButtonFl
import com.example.flinccalculatoralpha.navigation.Screens

@Composable
fun HomeScreen(navController: NavController) {
    Box(

    ){
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
        Image(painter = painterResource(id = R.drawable.flinc ), contentDescription = "logo image", modifier = Modifier.size(64.dp))
        Spacer(modifier = Modifier.size(64.dp))

            Spacer(modifier = Modifier.size(32.dp))
            FilledButtonFl(onClick = { navController.navigate(Screens.calculateScreen)
            }, label = stringResource(id = R.string.transfer_and_bond_cost_calculator))
            Spacer(modifier = Modifier.size(32.dp))
            FilledButtonFl(onClick = { /*TODO*/ }, label = stringResource(id = R.string.visit_our_website))
        }


    }
}