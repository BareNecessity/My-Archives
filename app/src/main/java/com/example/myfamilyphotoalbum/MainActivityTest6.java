package com.example.myfamilyphotoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myfamilyphotoalbum.test1.FifthActivity;
import com.example.myfamilyphotoalbum.test1.ThirdActivity;

public class MainActivityTest6 extends AppCompatActivity {
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test6);
        myButton = findViewById(R.id.button15);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivityTest6.this, FifthActivity.class);
                startActivity(move);
            }
        });
    }
}