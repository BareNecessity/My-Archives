package com.example.myfamilyphotoalbum.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import android.util.Log;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

import com.example.myfamilyphotoalbum.R;
import com.example.myfamilyphotoalbum.test1.MainActivity;
import com.example.myfamilyphotoalbum.test1.SecondActivity;

public class MainActivityTest2 extends AppCompatActivity {

    String realUsername = "Username24";
    String realPassword = "password123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test2);

        //Seen. What does it do?

        // When you click on the enter button, the content of the username and password get retrieved into a String

        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (usernameIsCorrect() && passwordIsCorrect()){
                    Intent move = new Intent(MainActivityTest2.this, MainActivity.class);
                    startActivity(move);
                }else{
                    Toast.makeText(MainActivityTest2.this, "Invalid username or password", Toast.LENGTH_LONG).show();
                }

            }});

    }

    private boolean passwordIsCorrect() {
        String userName = ((EditText)findViewById(R.id.editText2)).getText().toString();
        return userName.equals(realUsername);
    }

    private boolean usernameIsCorrect() {
        String password = ((EditText)findViewById(R.id.editText)).getText().toString();
        return password.equals(realPassword);
    }
}