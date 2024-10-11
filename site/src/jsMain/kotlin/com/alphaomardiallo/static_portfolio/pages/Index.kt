package com.alphaomardiallo.static_portfolio.pages

import androidx.compose.runtime.Composable
import com.alphaomardiallo.static_portfolio.components.ProfileCard
import com.alphaomardiallo.static_portfolio.util.Res
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .backgroundImage(
                linearGradient(
                    dir = LinearGradient.Direction.ToRight,
                    from = Res.Theme.GRADIENT_ONE.color,
                    to = Res.Theme.GRADIENT_TWO.color
                )
            ),
        contentAlignment = Alignment.Center
    ){
        ProfileCard()
    }
}
