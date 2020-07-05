package com.example.myfamilyphotoalbum.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myfamilyphotoalbum.MainActivityTest4;
import com.example.myfamilyphotoalbum.R;
import com.example.myfamilyphotoalbum.test2.MainActivityTest3;

public class SecondActivity extends AppCompatActivity {
    Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        myButton = findViewById(R.id.button3);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(move);
            }
                });
        myButton = findViewById(R.id.button5);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(SecondActivity.this, MainActivityTest4.class);
                startActivity(move);


            }
        });
        myButton = findViewById(R.id.button5);



            }
        }