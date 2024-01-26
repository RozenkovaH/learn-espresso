package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.MenuScreenStep
import com.example.myawesomeapp.step.MenuSidebarStep
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

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    /*@Test
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
}*/

    @Test
    fun checkMenuSidebar() {
        toolbar.toolbarCheck()
        sidebar.userInfoCheck()
        sidebar.sidebarButtonsCheck()
        sidebar.checkHomeScreen()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}