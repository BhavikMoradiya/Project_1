package com.example.bhavik.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    int b = 0;
    TextView count;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         count = (TextView)findViewById(R.id.count);
         a = getString(R.string.count);
        b = Integer.valueOf(a);
    }


    public void changeColor(View v)
    {
        Toast t;
        if(v.getId() == R.id.pushMe)
        {
            Button pushMe = (Button) findViewById(R.id.pushMe);
         //this is for changing text color in button
            pushMe.setTextColor(Color.RED);
         // for changing color in button
            pushMe.setBackgroundColor(Color.BLUE);
            t = Toast.makeText(this, "you are clicking on Push Me button", Toast.LENGTH_SHORT);
            t.show();
            b++;
        }
        else if (v.getId() == R.id.clickMe)
        {

            Button clickme = (Button) findViewById(R.id.clickMe);
            clickme.setTextColor(Color.BLUE);
            clickme.setBackgroundColor(Color.RED);
            t = Toast.makeText(this, "you are clicking on Click Me button", Toast.LENGTH_SHORT);
            t.show();

        }
        System.out.println(b);
        String cast = Integer.toString(b);
        count.setText(cast);
    }



}
