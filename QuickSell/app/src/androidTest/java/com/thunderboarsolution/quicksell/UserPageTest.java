package com.thunderboarsolution.quicksell;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class UserPageTest {
    private String name;
    private String mob;
    private String address;

    @Rule
    public ActivityScenarioRule<UserPage> activityRule
            = new ActivityScenarioRule<>(UserPage.class);

    @Before
    public void initValidString() {
        // Specify a valid string.
        name = "jathu";
        mob = "0772001027";
        address = "Jaffna";

    }

    @Test
    public void addInfo() {
        // Type text and then press the button.
        onView(withId(R.id.editTextTextPersonName3))
                .perform(typeText(name));
        onView(withId(R.id.editTextPhone))
                .perform(typeText(mob));
        onView(withId(R.id.editTextTextMultiLine))
                .perform(typeText(address));
        onView(withId(R.id.button5)).perform(click());


    }



}