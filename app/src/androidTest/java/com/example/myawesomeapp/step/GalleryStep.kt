package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.GalleryElement

class GalleryStep {
    private val galleryElement = GalleryElement()

    fun checkGalleryItemsListIsDisplayed() {
        galleryElement.galleryScreenTitle().check(matches(isDisplayed()))
        Thread.sleep(1000)
        galleryElement.galleryItemsList().check(matches(isDisplayed()))
    }

    fun clickOnGalleryItem(title: String) {
        galleryElement.galleryListItem(title).check(matches(isDisplayed())).perform(click())
    }

    fun swipeItemList() {
        galleryElement.galleryItemsList().perform(swipeUp())
    }
}