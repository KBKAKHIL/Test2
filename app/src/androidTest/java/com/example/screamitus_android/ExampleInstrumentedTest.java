package com.example.screamitus_android;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.widget.EditText;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.screamitus_android", appContext.getPackageName());
    }

    // Automated UI testing for Infection Calculator App
    //TC1 text box and button are visible; results label is hidden.
    //TC2 When calculate is pressed, should display correct number of infected instructors

    @Test
    public void TC1() {







    }



}
