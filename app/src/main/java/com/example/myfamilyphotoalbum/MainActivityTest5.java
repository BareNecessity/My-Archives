package com.example.myfamilyphotoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myfamilyphotoalbum.R;
import com.example.myfamilyphotoalbum.test1.FourthActivity;
import com.example.myfamilyphotoalbum.test1.ThirdActivity;
import com.example.myfamilyphotoalbum.test2.MainActivityTest3;

public class MainActivityTest5 extends AppCompatActivity {
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test5);
        myButton = findViewById(R.id.button14);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivityTest5.this, FourthActivity.class);
                startActivity(move);
            }
        });
    }
}