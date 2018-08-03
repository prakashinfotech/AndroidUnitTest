package com.psspl.unittestexample;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by haresh
 * on 11-06-2018.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityEspressoTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void EnterValueEditBox(){
        onView(withId(R.id.editEmail))
                .perform(typeText("haresh@prakashinfotech.com"));
        onView(withId(R.id.editPassword))
                .perform(typeText("54654564654654"), closeSoftKeyboard());
    }
    @After
   public void onButtonClick(){
        onView(withId(R.id.btnSubmit)).perform();
    }
}
