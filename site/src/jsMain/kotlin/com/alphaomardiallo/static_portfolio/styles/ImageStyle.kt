package com.alphaomardiallo.static_portfolio.styles

import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.scale
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import org.jetbrains.compose.web.css.ms
import com.varabyte.kobweb.silk.components.style.hover


val ImageStyle by ComponentStyle {
    base {
        Modifier
            .fillMaxSize()
            .objectFit(ObjectFit.Cover)
            .transition(CSSTransition(property = TransitionProperty.All, duration = 300.ms))
    }
    hover {
        Modifier.scale(0.9)
    }
}
