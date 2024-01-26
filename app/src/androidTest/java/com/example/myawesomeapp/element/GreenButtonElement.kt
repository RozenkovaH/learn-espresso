package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers
import com.example.myawesomeapp.R

class GreenButtonElement {
    fun greenButton(): ViewInteraction {
        return Espresso.onView(
            ViewMatchers.withId(R.id.fab)
        )
    }

    fun notification(): ViewInteraction {
        return Espresso.onView(
            ViewMatchers.withText("Replace with your own action")
        )
    }
}