package com.example.flinccalculatoralpha.feature

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.flinccalculatoralpha.R
import com.example.flinccalculatoralpha.components.FilledButtonFl
import com.example.flinccalculatoralpha.components.Title
import com.example.flinccalculatoralpha.navigation.Screens

@Composable
fun SummaryScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Row (horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Title(title = stringResource(id = R.string.transfer_and_bond_cost_calculator))
            IconButton(onClick = { navController.popBackStack()}) {
                Icons.Filled.ArrowBack
            }
        }
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)) {
            Text(
                text = "${stringResource(id =R.string.total_cost)}: Rxxxxxx",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )
            Text(
                text = "${stringResource(id =R.string.total_transfer_cost)}: R xxxxxx",
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )
            Text(
                text = stringResource(id =R.string.transfer_duty),
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )
            Text(
                text = stringResource(id = R.string.deeds_office),
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )
            Text(
                text = stringResource(id = R.string.attoney_fees),
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )
            Text(
                text = stringResource(id = R.string.post_petties),
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(id = R.string.total_bond_costs),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )
            Text(
                text = stringResource(id = R.string.deeds_office),
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )
            Text(
                text = stringResource(id = R.string.attoney_fees),
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )
            Text(
                text = stringResource(id = R.string.post_petties),
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )
            Row{
                FilledButtonFl(
                    onClick = {
                    },
                    label = stringResource(id = R.string.export))
                Spacer(modifier = Modifier.size(12.dp))
                FilledButtonFl(
                    onClick = {
                        navController.navigate(Screens.homeScreen)
                    },
                    label = stringResource(id = R.string.new_summary))
            }
        }
    }
}