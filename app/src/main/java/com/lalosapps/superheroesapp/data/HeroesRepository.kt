package com.lalosapps.superheroesapp.data

import com.lalosapps.superheroesapp.R
import com.lalosapps.superheroesapp.model.Hero

object HeroesRepository {
    val heroes = listOf(
        Hero(
            nameRes = R.string.hero1,
            descriptionRes = R.string.desc1,
            imageRes = R.drawable.android_superhero1
        ),
        Hero(
            nameRes = R.string.hero2,
            descriptionRes = R.string.desc2,
            imageRes = R.drawable.android_superhero2
        ),
        Hero(
            nameRes = R.string.hero3,
            descriptionRes = R.string.desc3,
            imageRes = R.drawable.android_superhero3
        ),
        Hero(
            nameRes = R.string.hero4,
            descriptionRes = R.string.desc4,
            imageRes = R.drawable.android_superhero4
        ),
        Hero(
            nameRes = R.string.hero5,
            descriptionRes = R.string.desc5,
            imageRes = R.drawable.android_superhero5
        ),
        Hero(
            nameRes = R.string.hero6,
            descriptionRes = R.string.desc6,
            imageRes = R.drawable.android_superhero6
        )
    )
}