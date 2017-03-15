package elle.testcoverage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView greetingView;
    GreetingClass greetingClass;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //grab the text and button
        greetingView = (TextView) findViewById(R.id.greeting);
        Button changeGreeting = (Button) findViewById(R.id.change_greeting);
        //set text
        greetingClass = new GreetingClass();
        greetingView.setText(greetingClass.getGreeting());
        //set on click listener
        changeGreeting.setOnClickListener(greetingButtonListener);
    }

    private View.OnClickListener greetingButtonListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            //change greeting
            greetingClass.nextGreeting();
            greetingView.setText(greetingClass.getGreeting());
        }
    };
}
