package com.lalosapps.superheroesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lalosapps.superheroesapp.data.HeroesRepository.heroes
import com.lalosapps.superheroesapp.ui.theme.SuperheroesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperheroesAppTheme {
                HeroesApp()
            }
        }
    }
}

@Composable
fun HeroesApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar()
        }
    ) {
        HeroList(heroes = heroes, Modifier.padding(it))
    }
}

@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .size(56.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            style = MaterialTheme.typography.h1
        )
    }
}

@Preview
@Composable
fun AppPreview() {
    SuperheroesAppTheme {
        HeroesApp()
    }
}