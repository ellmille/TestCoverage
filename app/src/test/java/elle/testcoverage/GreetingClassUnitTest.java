package elle.testcoverage;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by Elle on 3/15/2017 at 11:35 AM
 */

public class GreetingClassUnitTest extends TestCase
{
    private GreetingClass greetingClass;

    protected void setUp()
    {
        greetingClass = new GreetingClass();
    }

    public void testInitialGreeting()
    {
        //arrange
        //act
        //assert
        Assert.assertEquals(greetingClass.getGreeting(), "Hello World");
    }
}
