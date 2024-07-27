package com.example.sharedpreferencesapplication;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView textViewUserName;
    TextView textViewPassword;
    Button buttonLoad;
    Button buttonBackToMainActivity;
    SharedPrefManager sharedPrefManager;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        textViewUserName = (TextView) findViewById(R.id.textViewUserName);
        textViewPassword = (TextView) findViewById(R.id.textViewPassword);
        buttonLoad = (Button) findViewById(R.id.buttonLoad);
        buttonBackToMainActivity = (Button) findViewById(R.id.buttonBackToMainActivity);

        sharedPrefManager=SharedPrefManager.getInstance(this);

        intent = new Intent(SecondActivity.this,MainActivity.class);

        buttonLoad.setOnClickListener(v -> {
            textViewUserName.setText(sharedPrefManager.readString("userName","noValue"));
            textViewPassword.setText(sharedPrefManager.readString("password","noValue"));
        });

        buttonBackToMainActivity.setOnClickListener(v -> {
            startActivity(intent);
            finish();
        });

    }

}
