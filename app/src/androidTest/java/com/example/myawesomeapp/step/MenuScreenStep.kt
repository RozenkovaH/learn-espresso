package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import com.example.myawesomeapp.element.MenuScreenElement
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed

class MenuScreenStep {
    private val menuScreenElement = MenuScreenElement()

    fun checkMenuScreen() {
        menuScreenElement.menuBtn().check(matches(isDisplayed())).perform(click())
        menuScreenElement.menuOptionSlideshow().check(matches(isDisplayed())).perform(click())
    }
}