package com.alphaomardiallo.static_portfolio.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        BLUE(color = Color.rgb(r = 33, g = 150, b = 243)),
        DARK_BLUE(color = Color.rgb(r = 34, g = 63, b = 94)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 230, g = 230, b = 230)),
        GRADIENT_ONE(color = Color.rgb(r = 161, g = 196, b = 253)),
        GRADIENT_TWO(color = Color.rgb(r = 194, g = 233, b = 251)),
    }

    object Icon {
        const val EMAIL_LIGHT = "mail.svg"
        const val GITHUB = "github.svg"
        const val GOOGLE_PLAY = "googleplay.svg"
        const val LINKEDIN = "linkedin.svg"
        const val UPWORK = "upwork.svg"
    }

    object Image {
        const val PROFILE_PHOTO = "photo.jpg"
    }

    object String {
        const val NAME = "Alpha Diallo"
        const val PROFESSION = "Android & Kotlin Multiplaform Developer"
        const val ABOUT_ME =
            "I am an Android and Kotlin Multiplatform developer with 3 years of experience building high-quality apps. My work is live on the Play Store, and I’m always eager to connect and collaborate. Let’s build something amazing together!"
        const val BUTTON_TEXT = "Get in touch"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val MY_EMAIL = "mailto:alphaomar.diallo@outlook.com"
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1000
        const val MAX_CARD_HEIGHT = 600
        const val ICON_SIZE = 24
    }
}
