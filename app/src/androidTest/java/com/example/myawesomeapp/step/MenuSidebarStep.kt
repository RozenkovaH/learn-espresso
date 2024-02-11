package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.MenuSidebarElement

class MenuSidebarStep {
    private val menuSidebarElement = MenuSidebarElement()

    fun checkUserPic() {
        menuSidebarElement.userPic().check(matches(isDisplayed()))
    }

    fun checkUserInfoElements(userName: String, mail: String) {
        menuSidebarElement.userInfoElements(userInfo = userName).check(matches(isDisplayed()))
        menuSidebarElement.userInfoElements(userInfo = mail).check(matches(isDisplayed()))
    }

    fun checkSidebarButtons() {
        menuSidebarElement.galleryBtn().check(matches(isDisplayed()))
        menuSidebarElement.slideshowBtn().check(matches(isDisplayed()))
        menuSidebarElement.homeBtn().check(matches(isDisplayed()))
    }

    fun clickHomeBtn() {
        menuSidebarElement.homeBtn().check(matches(isDisplayed())).perform(
            click()
        )
    }

    fun clickGalleryBtn() {
        menuSidebarElement.galleryBtn().check(matches(isDisplayed())).perform(click())
            .check(matches(isChecked()))
        menuSidebarElement.galleryBtn().check(matches(isChecked()))
    }
}