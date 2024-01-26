package com.example.myawesomeapp.element

import androidx.appcompat.widget.LinearLayoutCompat
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.hasSibling
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.myawesomeapp.R
import org.hamcrest.CoreMatchers
import java.util.concurrent.CompletableFuture.allOf

class ToolbarElement {
    fun toolbar(): ViewInteraction {
        return Espresso.onView(
            withId(R.id.toolbar)
        )
    }

    fun menuBtn(): ViewInteraction {
        return Espresso.onView(
            CoreMatchers.anyOf(
                withContentDescription(R.string.navigation_drawer_open),
                withContentDescription("Открыть панель навигации")
            )
        )
    }

    fun homeHeader(): ViewInteraction {
        return Espresso.onView(
            CoreMatchers.allOf(
                ViewMatchers.withText("Home"),
                isDescendantOfA(withId(R.id.toolbar))
            )
        )
    }

    fun optionsBtn(): ViewInteraction {
        return Espresso.onView(
            CoreMatchers.allOf(
                isDescendantOfA(withId(R.id.toolbar)),
                isAssignableFrom(LinearLayoutCompat::class.java)
            )
        )
    }
}