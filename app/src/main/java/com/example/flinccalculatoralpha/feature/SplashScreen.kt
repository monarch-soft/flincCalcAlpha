package com.example.flinccalculatoralpha.feature

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.flinccalculatoralpha.R
import com.example.flinccalculatoralpha.navigation.Screens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.flinc), contentDescription ="flinc")
            Spacer(modifier = Modifier.size(16.dp))
            Text(text = stringResource(id = R.string.property_cost), fontSize = 24.sp)
            Text(text = stringResource(id = R.string.calculator_app),fontSize = 24.sp)
        }
        LaunchedEffect(Unit){
            delay(2000)
            navController.navigate(Screens.onboardingScreen)

        }
    }
}