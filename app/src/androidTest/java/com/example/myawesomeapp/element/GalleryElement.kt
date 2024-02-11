package com.example.myawesomeapp.element

import android.widget.RelativeLayout
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.hasSibling
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import com.example.myawesomeapp.R
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.CoreMatchers.allOf

class GalleryElement {

    fun galleryScreenTitle(): ViewInteraction {
        return onView(
            allOf(
                withText("Gallery"),
                isDescendantOfA(withId(R.id.toolbar))
            )
        )
    }

    fun galleryItemsList(): ViewInteraction {
        return onView(
            withId(R.id.recycle_view)
        )
    }

    fun galleryListItem(title: String): ViewInteraction {
        return onView(
            allOf(
                isDescendantOfA(isAssignableFrom(RelativeLayout::class.java)),
                withId(R.id.item_title),
                hasSibling(
                    allOf(
                        withText(title),
                        withId(R.id.item_number)
                    )
                )
            )
        )
    }
}