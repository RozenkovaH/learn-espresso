package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.example.myawesomeapp.element.MenuSidebarElement

class MenuSidebarStep {
    private val menuSidebarElement = MenuSidebarElement()

    fun userInfoCheck() {
        menuSidebarElement.userPic().check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        menuSidebarElement.userName().check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        menuSidebarElement.mail().check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    fun sidebarButtonsCheck() {
        menuSidebarElement.galleryBtn().check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        menuSidebarElement.slideshowBtn().check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        menuSidebarElement.homeBtn().check(ViewAssertions.matches(ViewMatchers.isDisplayed())).perform(
            ViewActions.click())
    }

    fun checkHomeScreen() {
        menuSidebarElement.checkHomeScreen().check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}