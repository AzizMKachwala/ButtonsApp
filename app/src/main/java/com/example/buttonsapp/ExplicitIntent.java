package com.example.buttonsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExplicitIntent extends AppCompatActivity {


    String msg;
    EditText etvName;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        etvName = findViewById(R.id.etvName);
        btnClick = findViewById(R.id.btnClick);

        etvName.setText(msg);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ExplicitIntent.this, etvName.getText(), Toast.LENGTH_LONG).show();
            }
        });

    }
}