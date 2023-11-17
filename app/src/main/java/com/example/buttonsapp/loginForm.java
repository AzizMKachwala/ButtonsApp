package com.example.buttonsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginForm extends AppCompatActivity {

    EditText username,password;
    Button submit;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        username = findViewById(R.id.etvUsername);
        password = findViewById(R.id.etvPassword);
        submit = findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                intent = new Intent(loginForm.this,loginFormResult.class);
                intent.putExtra("Username",user);
                intent.putExtra("Password",pass);


                startActivity(intent);
            }
        });
    }
}