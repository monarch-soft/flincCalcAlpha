package com.example.flinccalculatoralpha.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.flinccalculatoralpha.feature.CalculateScreen
import com.example.flinccalculatoralpha.feature.HomeScreen

import com.example.flinccalculatoralpha.feature.SummaryScreen
import com.example.flinccalculatoralpha.onboarding.OnboardingScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.onboardingScreen) {
        composable(route = Screens.onboardingScreen) {
            OnboardingScreen(navController = navController)
        }
        composable(route = Screens.homeScreen) {
            HomeScreen(navController = navController)
        }
        composable(route = Screens.calculateScreen) {
            CalculateScreen(navController = navController)
        }
        composable(route = Screens.summaryScreen){
                SummaryScreen(navController = navController)
        }
    }
}
