package com.example.myfamilyphotoalbum.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.myfamilyphotoalbum.R;

public class MainActivityTest2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test2);

        String userName = ((EditText)findViewById(R.id.editText2)).getText().toString();

        String password = ((EditText)findViewById(R.id.editText)).getText().toString();
        //Seen. What does it do?
    }
}