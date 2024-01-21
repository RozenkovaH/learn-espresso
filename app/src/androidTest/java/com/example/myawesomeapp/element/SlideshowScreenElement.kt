package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.core.AllOf.allOf

class SlideshowScreenElement {
    fun menuButtonDescription(): ViewInteraction {
        return onView(
            withContentDescription("Открыть панель навигации")
        )
    }

    fun menuOptionSlideshowText(): ViewInteraction {
        return onView(
            withText("Slideshow")
        )
    }

    fun slideshowScreenText(): ViewInteraction {
        return onView(
            allOf(
                withId(R.id.text_slideshow),
                withText("This is slideshow Fragment")
            )
        )
    }
}