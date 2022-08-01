package com.lalosapps.superheroesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.lalosapps.superheroesapp.data.HeroesRepository.heroes
import com.lalosapps.superheroesapp.ui.theme.SuperheroesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperheroesAppTheme {
                HeroList(heroes)
            }
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    SuperheroesAppTheme {
        HeroList(heroes)
    }
}