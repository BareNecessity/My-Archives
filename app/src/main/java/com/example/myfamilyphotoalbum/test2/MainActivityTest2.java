package com.example.myfamilyphotoalbum.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myfamilyphotoalbum.R;
import com.example.myfamilyphotoalbum.test1.MainActivity;
import com.example.myfamilyphotoalbum.test1.SecondActivity;

public class MainActivityTest2 extends AppCompatActivity {
    Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test2);

        String userName = ((EditText)findViewById(R.id.editText2)).getText().toString();

        String password = ((EditText)findViewById(R.id.editText)).getText().toString();
        //Seen. What does it do?


        myButton = findViewById(R.id.button7);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivityTest2.this, MainActivity.class);
                startActivity(move);
            }
        });




    }
}