package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.GreenButtonElement

class GreenButtonStep {
    private val greenButtonElement = GreenButtonElement()

    fun clickOnGreenButton() {
        greenButtonElement.greenButton().check(matches(isDisplayed())).perform(click())
    }
}