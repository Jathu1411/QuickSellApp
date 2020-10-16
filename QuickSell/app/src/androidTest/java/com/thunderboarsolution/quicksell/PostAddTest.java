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

public class PostAddTest {
    private String name, price, description;

    @Rule
    public ActivityScenarioRule<PostAdd> activityRule
            = new ActivityScenarioRule<>(PostAdd.class);

    @Before
    public void initValidString() {
        // Specify a valid string.
        name = "Fan";
        price = "1234";
        description = "used for one month";

    }

    @Test
    public void addInfo() {
        // Type text and then press the button.
        onView(withId(R.id.editTextTextPersonName))
                .perform(typeText(name));
        onView(withId(R.id.editTextTextPersonName2))
                .perform(typeText(description));
        onView(withId(R.id.editTextNumberDecimal))
                .perform(typeText(price));
        onView(withId(R.id.button3)).perform(click());


    }


}