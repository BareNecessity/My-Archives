package com.example.myfamilyphotoalbum.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myfamilyphotoalbum.R;

public class FourthActivity extends AppCompatActivity {
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        myButton = findViewById(R.id.button5);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(FourthActivity.this, ThirdActivity.class);
                startActivity(move);
            }

        });
        myButton = findViewById(R.id.button2);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(FourthActivity.this, FifthActivity.class);
                startActivity(move);
            }
        });



            }
}