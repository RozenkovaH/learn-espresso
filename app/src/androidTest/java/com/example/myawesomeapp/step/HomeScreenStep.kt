package com.example.myawesomeapp.step

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.HomeScreenElement

class HomeScreenStep {
    private val homeScreenElement = HomeScreenElement()

    fun checkHomeScreenTextIsDisplayed() {
        homeScreenElement.homeScreenText().check(matches(isDisplayed()))
    }
}