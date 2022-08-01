package com.lalosapps.superheroesapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.lalosapps.superheroesapp.model.Hero

@Composable
fun HeroList(heroes: List<Hero>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
    ) {
        items(heroes) {
            HeroItem(hero = it)
        }
    }
}

@Composable
fun HeroItem(hero: Hero, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        elevation = 2.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .sizeIn(minHeight = 72.dp)
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(hero.nameRes),
                    style = MaterialTheme.typography.h3
                )
                Text(
                    text = stringResource(hero.descriptionRes),
                    style = MaterialTheme.typography.body1
                )
            }
            Spacer(Modifier.width(16.dp))
            Image(
                modifier = Modifier
                    .size(72.dp)
                    .clip(RoundedCornerShape(8.dp)),
                painter = painterResource(hero.imageRes),
                contentDescription = null,
                alignment = Alignment.TopCenter,
                contentScale = ContentScale.FillWidth
            )
        }
    }
}