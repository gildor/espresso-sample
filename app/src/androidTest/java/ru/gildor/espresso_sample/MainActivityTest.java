package ru.gildor.espresso_sample;

import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class MainActivityTest {

    public static final String TAG = "MainActivityTest";

    public final ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class, false, false);

    @Before
    public void setUp() throws Exception {
        rule.launchActivity(null);
        Log.d(TAG, "setUp " + rule.getActivity());
    }

    @After
    public void tearDown() throws Exception {
        Log.d(TAG, "tearDown  " + this);
    }

    @Test
    public void test1() {
        assertTrue(true);
    }

    @Test
    public void test2() {
        assertTrue(true);
    }

    @Test
    public void test3() {
        assertTrue(true);
    }
}
