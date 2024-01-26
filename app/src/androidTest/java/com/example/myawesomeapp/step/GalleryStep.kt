package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.GalleryElement

class GalleryStep {
    private val galleryElement = GalleryElement()

    fun galleryBtnCheck() {
        galleryElement.menuBtn().check(matches(isDisplayed())).perform(
            ViewActions.click())
        galleryElement.galleryBtn().check(matches(isDisplayed())).perform(
            ViewActions.click()).check(matches(isChecked()))
        galleryElement.galleryBtn().check(matches(isChecked()))
    }

    fun galleryScreenCheck() {
        galleryElement.galleryScreen().check(matches(isDisplayed()))
        Thread.sleep(1000)
        galleryElement.galleryList().check(matches(isDisplayed()))
    }

    fun firstItemsCheck() {
        galleryElement.firstItem().check(matches(isDisplayed()))
        galleryElement.firstItem().perform(ViewActions.click())
        galleryElement.firstItemNotification().check(matches(isDisplayed()))
    }

    fun lastItemsCheck() {
        galleryElement.galleryList().perform(swipeUp())
        galleryElement.tenthItem().check(matches(isDisplayed())).perform(
            ViewActions.click())
        galleryElement.tenthItemNotification().check(matches(isDisplayed()))
    }
}