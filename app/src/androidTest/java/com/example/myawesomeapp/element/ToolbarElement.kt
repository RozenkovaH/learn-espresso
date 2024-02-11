package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.anyOf

class ToolbarElement {
    fun toolbar(): ViewInteraction {
        return onView(
            withId(R.id.toolbar)
        )
    }

    fun menuBtn(): ViewInteraction {
        return onView(
            anyOf(
                withContentDescription(R.string.navigation_drawer_open),
                withContentDescription("Открыть панель навигации")
            )
        )
    }

    fun homeHeader(): ViewInteraction {
        return onView(
            allOf(
                withText("Home"),
                isDescendantOfA(withId(R.id.toolbar))
            )
        )
    }

    fun optionsBtn(): ViewInteraction {
        return onView(
            allOf(
                isDescendantOfA(withId(R.id.toolbar)),
                withContentDescription("Ещё")
            )
        )
    }
}