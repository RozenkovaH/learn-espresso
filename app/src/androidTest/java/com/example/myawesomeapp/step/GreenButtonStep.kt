package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.matcher.ViewMatchers
import com.example.myawesomeapp.element.GreenButtonElement

class GreenButtonStep {
    private val greenButtonElement = GreenButtonElement()

    fun greenButtonCheck() {
        greenButtonElement.greenButton().check(ViewAssertions.matches(ViewMatchers.isDisplayed())).perform(
            ViewActions.click())
    }

    fun notificationCheck() {
        greenButtonElement.notification().check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    fun notificationClose() {
        greenButtonElement.notification().perform(swipeRight())
        Thread.sleep(1000)
        greenButtonElement.notification().check(doesNotExist())
    }
}