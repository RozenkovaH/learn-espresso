package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.CoreMatchers.allOf

class NotificationElement {

    fun notification(notificationText: String): ViewInteraction {
        return onView(
            allOf(
                withId(com.google.android.material.R.id.snackbar_text),
                withText(notificationText)
            )
        )
    }
}