package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.NotificationElement

class NotificationStep {
    private val notificationElement = NotificationElement()

    fun checkNotificationIsDisplayed(notificationText: String) {
        notificationElement.notification(notificationText).check(matches(isDisplayed()))
    }

    fun closeNotification(notificationText: String) {
        notificationElement.notification(notificationText).perform(swipeRight())
        Thread.sleep(1000)
        notificationElement.notification(notificationText).check(doesNotExist())
    }
}