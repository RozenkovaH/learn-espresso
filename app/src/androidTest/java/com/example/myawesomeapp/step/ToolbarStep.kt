package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.example.myawesomeapp.element.ToolbarElement

class ToolbarStep {
    private val toolbarElement = ToolbarElement()

    fun toolbarCheck() {
        toolbarElement.homeHeader().check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        toolbarElement.optionsBtn().check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        toolbarElement.menuBtn().check(ViewAssertions.matches(ViewMatchers.isDisplayed())).perform(
            ViewActions.click())
    }

}