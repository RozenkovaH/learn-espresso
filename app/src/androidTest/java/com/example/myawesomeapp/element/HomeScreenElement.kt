package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.CoreMatchers.allOf

class HomeScreenElement {
    fun homeScreenText(): ViewInteraction {
        return onView(
            allOf(
                withId(R.id.text_home),
                withText("This is home Fragment")
            )
        )
    }
}