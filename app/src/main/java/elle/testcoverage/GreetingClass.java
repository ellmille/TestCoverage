package elle.testcoverage;

/**
 * Created by Elle on 3/15/2017 at 10:55 AM
 */

class GreetingClass
{
    private int greeting;

    GreetingClass()
    {
        greeting = 0;
    }

    String getGreeting()
    {
        return getGreetingString(greeting);
    }

    void setGreeting(int greetingIn)
    {
        greeting = greetingIn;
    }

    void nextGreeting()
    {
        if(greeting < 6)
        {
            greeting += 1;
        }
        else
        {
            greeting = 0;
        }
    }

    private String getGreetingString(int greetingIn)
    {
        switch (greetingIn)
        {
            case 0:
                return "Hello World";
            case 1:
                return "Hola Mundo";
            case 2:
                return "Hallo Welt";
            case 3:
                return "Bonjour le monde";
            case 4:
                return "Saluton mondo";
            case 5:
                return "Olá Mundo";
            case 6:
                return "Hej världen";
            default:
                return "Saluton mondo";
        }
    }
}
