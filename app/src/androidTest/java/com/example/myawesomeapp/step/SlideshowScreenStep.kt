package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.example.myawesomeapp.element.SlideshowScreenElement

class SlideshowScreenStep {
    private val slideshowScreenElement = SlideshowScreenElement()

    fun checkSlideshowScreen() {
        slideshowScreenElement.menuButtonDescription().perform(ViewActions.click())
        slideshowScreenElement.menuOptionSlideshowText().perform(ViewActions.click())
        slideshowScreenElement.slideshowScreenText().check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}