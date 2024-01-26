package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import com.example.myawesomeapp.R
import org.hamcrest.CoreMatchers.allOf

class MenuSidebarElement {
    fun userPic(): ViewInteraction {
        return Espresso.onView(
            ViewMatchers.withId(R.id.imageView)
        )
    }

    fun userName(): ViewInteraction {
        return Espresso.onView(
            ViewMatchers.withText("Android Studio")
        )
    }

    fun mail(): ViewInteraction {
        return Espresso.onView(
            ViewMatchers.withText("android.studio@android.com")
        )
    }

    fun homeBtn(): ViewInteraction {
        return Espresso.onView(
            allOf(
                ViewMatchers.withText("Home"),
                isDescendantOfA(ViewMatchers.withId(R.id.nav_home))
            )
        )
    }

    fun galleryBtn(): ViewInteraction {
        return Espresso.onView(
            ViewMatchers.withText("Gallery")
        )
    }

    fun slideshowBtn(): ViewInteraction {
        return Espresso.onView(
            ViewMatchers.withText("Slideshow")
        )
    }

    fun checkHomeScreen(): ViewInteraction {
        return Espresso.onView(
           allOf(
                ViewMatchers.withId(R.id.text_home),
                ViewMatchers.withText("This is home Fragment")
            )
        )
    }
}