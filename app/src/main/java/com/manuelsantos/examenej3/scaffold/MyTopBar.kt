package com.manuelsantos.examenej3.scaffold

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.manuelsantos.examenej3.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(navigateToBack: () -> Unit) {
    TopAppBar(
        title = { Text(stringResource(id = R.string.topBar)) },
        actions = {
            Button(
                onClick = { navigateToBack() }
            ) {
                Text(stringResource(id = R.string.logout))
                Spacer(modifier = Modifier.padding(horizontal = 2.dp))
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = ""
                )
            }
        }
    )
}