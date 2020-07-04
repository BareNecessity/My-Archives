package com.example.myfamilyphotoalbum.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import android.util.Log;
import android.view.View;

import android.widget.EditText;

import com.example.myfamilyphotoalbum.R;
import com.example.myfamilyphotoalbum.test1.MainActivity;
import com.example.myfamilyphotoalbum.test1.SecondActivity;

public class MainActivityTest2 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test2);

        //Seen. What does it do?


        // When you click on the enter button, the content of the username and password get retrieved into a String

        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userName = ((EditText)findViewById(R.id.editText2)).getText().toString();

                String password = ((EditText)findViewById(R.id.editText)).getText().toString();

                Log.v("myTag", "userName = " +userName);
                Log.v("myTag", "password = " +password);


                    }
                });


    }
}