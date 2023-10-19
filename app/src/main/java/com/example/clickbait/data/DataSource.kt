package com.example.clickbait.data

import com.example.clickbait.R
import com.example.clickbait.model.Headline

object DataSource {
    val headlines = listOf(
        Headline(R.drawable.travel, R.string.buzzfeed, R.string.headline1, R.string.time1),
        Headline(R.drawable.pet, R.string.infofrenzyhub, R.string.headline2, R.string.time2),
        Headline(R.drawable.fantasy, R.string.viralinsightglobe, R.string.headline3, R.string.time3),
        Headline(R.drawable.diy, R.string.viralinsightglobe, R.string.headline4, R.string.time4),
        Headline(R.drawable.cartoons, R.string.curiositysphere, R.string.headline5, R.string.time5),
        Headline(R.drawable.pizza, R.string.infofrenzyhub, R.string.headline6, R.string.time6),
        Headline(R.drawable.celebrity, R.string.trendunveilarena, R.string.headline7, R.string.time7),
        Headline(R.drawable.junkfood, R.string.buzzfeed, R.string.headline8, R.string.time8),
        Headline(R.drawable.soulmate, R.string.curiositysphere, R.string.headline9, R.string.time9),
        Headline(R.drawable.lifehacks, R.string.huffpost, R.string.headline10, R.string.time10)
    )
}