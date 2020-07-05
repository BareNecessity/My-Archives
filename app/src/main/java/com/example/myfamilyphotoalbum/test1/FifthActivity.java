package com.example.myfamilyphotoalbum.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myfamilyphotoalbum.R;
import com.example.myfamilyphotoalbum.test2.MainActivityTest2;

public class FifthActivity extends AppCompatActivity {
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        myButton = findViewById(R.id.button4);

        // Line by Kola
        // this is the way.

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(FifthActivity.this, MainActivityTest2.class);
                startActivity(move);
            }

        });
    }
}