package com.example.clickbait.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Headline(
    @DrawableRes val imageResourceId: Int,
    @StringRes val site: Int,
    @StringRes val headline: Int,
    @StringRes val time: Int
)
