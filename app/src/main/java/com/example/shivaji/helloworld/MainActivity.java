package com.example.shivaji.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView text;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(this,"Click Button to see the change!",Toast.LENGTH_SHORT);
        toast.show();

        btn = (Button) findViewById(R.id.my_btn);
        text = (TextView) findViewById(R.id.tv1);
        editText = (EditText)findViewById(R.id.et);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gets the current text in the EditText
                String name = editText.getText().toString();

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("name",  name);
                startActivity(i);
                Log.d("MainActivity", "SecondActivity launched!!");

            }
        });
    }


}
