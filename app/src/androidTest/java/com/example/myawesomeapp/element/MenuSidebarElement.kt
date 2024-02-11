package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.hasSibling
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.CoreMatchers.allOf

class MenuSidebarElement {
    fun userPic(): ViewInteraction {
        return onView(
            withId(R.id.imageView)
        )
    }

    fun userInfoElements(userInfo: String): ViewInteraction {
        return onView(
            allOf(
                hasSibling(withContentDescription("Navigation header")),
                isAssignableFrom(android.widget.TextView::class.java),
                withText(userInfo)
            )
        )
    }

    fun homeBtn(): ViewInteraction {
        return onView(
            allOf(
                withText("Home"),
                isDescendantOfA(withId(R.id.nav_home))
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

    fun slideshowBtn(): ViewInteraction {
        return onView(
            allOf(
                withText("Slideshow"),
                isDescendantOfA(withId(R.id.nav_slideshow))
            )
        )
    }
}