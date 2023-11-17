package com.example.buttonsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class loginFormResult extends AppCompatActivity {

    TextView usernameText, passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form_result);

        usernameText = findViewById(R.id.txtUserName);
        passwordText = findViewById(R.id.txtPassWord);

        String un = getIntent().getStringExtra("Username");
        String pw = getIntent().getStringExtra("Password");

        usernameText.setText(un);
        passwordText.setText(pw);

    }
}