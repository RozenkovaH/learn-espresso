package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.anyOf
import com.google.android.material.R as materialR

class MenuScreenElement {
    fun menuBtn(): ViewInteraction {
        return Espresso.onView(
            anyOf(
                withContentDescription(R.string.navigation_drawer_open),
                withContentDescription("Открыть панель навигации")
            )
        )
    }

    fun menuOptionSlideshow(): ViewInteraction {
        return Espresso.onView(
            allOf(
                withText("Slideshow"),
                withId(materialR.id.design_menu_item_text)
            )
        )
    }
}