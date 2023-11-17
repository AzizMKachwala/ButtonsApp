package com.example.buttonsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentOption extends AppCompatActivity {

    Button implicitIntentBtn,explicitIntentBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_option);

        implicitIntentBtn = findViewById(R.id.implicitDemo);

        implicitIntentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntentOption.this,ImplicitIntent.class);
                startActivity(intent);
            }
        });

        explicitIntentBtn = findViewById(R.id.explicitDemo);

        explicitIntentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntentOption.this,ExplicitIntent.class);
                startActivity(intent);
            }
        });

    }
}