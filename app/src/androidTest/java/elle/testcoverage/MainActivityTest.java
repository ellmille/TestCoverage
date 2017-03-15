package elle.testcoverage;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

/**
 * Created by Elle on 3/15/2017 at 11:26 AM
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest extends ActivityTestRule<MainActivity>
{
    private GreetingClass greetingClass;

    public MainActivityTest()
    {
        super(MainActivity.class);
        greetingClass = new GreetingClass();
    }

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() throws Exception
    {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("elle.testcoverage", appContext.getPackageName());
    }

    @Test
    public void testChangeGreeting()
    {
        //arrange
        greetingClass.setGreeting(0);
        //act
        onView(withId(R.id.change_greeting)).perform(click());
        //assert
        onView(withId(R.id.greeting)).check(matches(withText("Hola Mundo")));
    }
}
