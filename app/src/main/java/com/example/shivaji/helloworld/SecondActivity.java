package com.example.shivaji.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String name = getIntent().getExtras().getString("name");
        textView2 = (TextView) findViewById(R.id.tv2);
        textView2.setText("Hi " + name + "!\nYou have reached the second Activity!");
    }
}
