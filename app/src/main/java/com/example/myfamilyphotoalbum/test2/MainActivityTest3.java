package com.example.myfamilyphotoalbum.test2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myfamilyphotoalbum.R;
import com.example.myfamilyphotoalbum.test1.MainActivity;
import com.example.myfamilyphotoalbum.test1.SecondActivity;

public class MainActivityTest3 extends AppCompatActivity {
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test3);
        myButton = findViewById(R.id.button12);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivityTest3.this, SecondActivity.class);
                startActivity(move);
            }
        });
    }
}