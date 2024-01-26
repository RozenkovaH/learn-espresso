package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers
import com.example.myawesomeapp.R
import org.hamcrest.CoreMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import androidx.test.espresso.matcher.ViewMatchers.withParentIndex
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.CoreMatchers.allOf

class GalleryElement {
    fun menuBtn(): ViewInteraction {
        return onView(
            CoreMatchers.anyOf(
                ViewMatchers.withContentDescription(R.string.navigation_drawer_open),
                ViewMatchers.withContentDescription("Открыть панель навигации")
            )
        )
    }

    fun galleryBtn(): ViewInteraction {
        return onView(
            allOf(
                withText("Gallery"),
                isDescendantOfA(withId(R.id.nav_gallery))
            )
        )
    }

    fun galleryScreen(): ViewInteraction {
        return onView(
            allOf(
                withText("Gallery"),
                isDescendantOfA(withId(R.id.toolbar))
            )
        )
    }

    fun galleryList(): ViewInteraction {
        return onView(
                withId(R.id.recycle_view)
        )
    }

    fun firstItem(): ViewInteraction {
        return onView(
            allOf(
                withText("My title"),
                withParent(withParentIndex(0)))
        )
    }

    fun firstItemNotification(): ViewInteraction {
        return onView(
                withText("Item #1 clicked successfully!")
        )
    }

    fun tenthItem(): ViewInteraction {
        return onView(
            allOf(
                withText("My title"),
                withParent(withParentIndex(6)))
        )
    }

    fun tenthItemNotification(): ViewInteraction {
        return onView(
            withText("Item #10 clicked successfully!")
        )
    }
}