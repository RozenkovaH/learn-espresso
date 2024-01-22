package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.CoreMatchers.allOf

class SlideshowScreenElement {
    fun slideshowScreenText(): ViewInteraction {
        return onView(
            allOf(
                withId(R.id.text_slideshow),
                withText("This is slideshow Fragment")
            )
        )
    }
}