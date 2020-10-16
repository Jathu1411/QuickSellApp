package com.thunderboarsolution.quicksell;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class RegisterPageTest {
    private String email;
    private String password;



    @Rule
    public ActivityScenarioRule<RegisterPage> activityRule
            = new ActivityScenarioRule<>(RegisterPage.class);

    @Before
    public void initValidString() {
        // Specify a valid string.
        email = "jathu@gmail.com";
        password = "jathusanan";

    }

    @Test
    public void changeText_sameActivity() {
        // Type text and then press the button.
        onView(withId(R.id.editTextTextEmailAddress))
                .perform(typeText(email));
        onView(withId(R.id.editTextTextPassword))
                .perform(typeText(password));
        onView(withId(R.id.button)).perform(click());


    }


}