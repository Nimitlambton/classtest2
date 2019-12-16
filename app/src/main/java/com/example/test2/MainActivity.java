package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


  EditText username ,password;
  Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = findViewById(R.id.uName);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);


    }

    public void onlogin(View view) {



        String userEntry = username.getText().toString();
        String passEntry = password.getText().toString();

        if (userEntry.equals("") || userEntry.equals("") ) {


            Toast.makeText(getApplicationContext(), "please fill everything", Toast.LENGTH_LONG).show();

        }
        {

            if (userEntry.equals("user1") && passEntry.equals("password1")) {

                Intent go = new Intent(this, countiesActivity.class);

                startActivity(go);


            } else {

                Toast.makeText(getApplicationContext(), "Invalid username or password", Toast.LENGTH_LONG).show();

            }

        }

    }
}
