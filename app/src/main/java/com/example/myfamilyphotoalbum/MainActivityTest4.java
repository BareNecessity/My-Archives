package com.example.myfamilyphotoalbum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myfamilyphotoalbum.test1.MainActivity;
import com.example.myfamilyphotoalbum.test1.ThirdActivity;
import com.example.myfamilyphotoalbum.test2.MainActivityTest3;

public class MainActivityTest4 extends AppCompatActivity {
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test4);
        myButton = findViewById(R.id.button13);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivityTest4.this, ThirdActivity.class);
                startActivity(move);
            }
        });

    }
}