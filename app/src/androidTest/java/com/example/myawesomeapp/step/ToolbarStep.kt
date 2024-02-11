package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.ToolbarElement

class ToolbarStep {
    private val toolbarElement = ToolbarElement()

    fun checkToolbar() {
        toolbarElement.toolbar().check(matches(isDisplayed()))
    }

    fun checkToolbarElements() {
        toolbarElement.homeHeader().check(matches(isDisplayed()))
        toolbarElement.optionsBtn().check(matches(isDisplayed()))
        toolbarElement.menuBtn().check(matches(isDisplayed()))
    }

    fun clickOnMenuBtn() {
        toolbarElement.menuBtn().check(matches(isDisplayed())).perform(click())
    }
}