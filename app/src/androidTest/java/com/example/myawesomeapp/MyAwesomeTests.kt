package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.GalleryStep
import com.example.myawesomeapp.step.GreenButtonStep
import com.example.myawesomeapp.step.HomeScreenStep
import com.example.myawesomeapp.step.MenuScreenStep
import com.example.myawesomeapp.step.MenuSidebarStep
import com.example.myawesomeapp.step.NotificationStep
import com.example.myawesomeapp.step.SlideshowScreenStep
import com.example.myawesomeapp.step.ToolbarStep
import org.hamcrest.core.AllOf.allOf
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyAwesomeTests {
    private lateinit var scenario: ActivityScenario<MainActivity>

    private val menu = MenuScreenStep()
    private val slideshow = SlideshowScreenStep()
    private val toolbar = ToolbarStep()
    private val sidebar = MenuSidebarStep()
    private val homeScreen = HomeScreenStep()
    private val greenButton = GreenButtonStep()
    private val notification = NotificationStep()
    private val gallery = GalleryStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkMainScreen() {
        onView(
            allOf(
                withId(R.id.text_home),
                withText("This is home Fragment")
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun checkSlideshowScreen() {
        menu.openMenu()
        menu.clickSlideshowOption()
        slideshow.checkSlideshowScreen()
    }

    @Test
    fun checkMenuSidebar() {
        toolbar.checkToolbar()
        toolbar.checkToolbarElements()
        toolbar.clickOnMenuBtn()
        sidebar.checkUserPic()
        sidebar.checkUserInfoElements("Android Studio", "android.studio@android.com")
        sidebar.checkSidebarButtons()
        sidebar.clickHomeBtn()
        homeScreen.checkHomeScreenTextIsDisplayed()
    }

    @Test
    fun checkGreenButton() {
        homeScreen.checkHomeScreenTextIsDisplayed()
        greenButton.clickOnGreenButton()
        notification.checkNotificationIsDisplayed("Replace with your own action")
        notification.closeNotification("Replace with your own action")
    }

    @Test
    fun checkGalleryScreen() {
        homeScreen.checkHomeScreenTextIsDisplayed()
        toolbar.checkToolbar()
        toolbar.clickOnMenuBtn()
        sidebar.clickGalleryBtn()
        gallery.checkGalleryItemsListIsDisplayed()
        gallery.clickOnGalleryItem("1")
        notification.checkNotificationIsDisplayed("Item #1 clicked successfully!")
        gallery.swipeItemList()
        gallery.clickOnGalleryItem("10")
        notification.checkNotificationIsDisplayed("Item #10 clicked successfully!")
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}