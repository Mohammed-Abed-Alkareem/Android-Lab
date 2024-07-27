package com.example.sharedpreferencesapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextUserName;
    EditText editTextPassword;
    Button buttonSave;
    Button buttonGoToSecondActivity;
    SharedPrefManager sharedPrefManager;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUserName = (EditText) findViewById(R.id.editTextUserName);
        editTextPassword = (EditText) findViewById(R.id.editText_password);
        buttonSave = (Button) findViewById(R.id.buttonSave);
        buttonGoToSecondActivity = (Button) findViewById(R.id.buttonGoToSecondActivity);
        sharedPrefManager =SharedPrefManager.getInstance(this);
        intent = new Intent(MainActivity.this,SecondActivity.class);

        buttonSave.setOnClickListener(v -> {
            sharedPrefManager.writeString("userName",editTextUserName.getText().toString());
            sharedPrefManager.writeString("password",editTextPassword.getText().toString());
            Toast.makeText(MainActivity.this, "Values written to shared Preferences", Toast.LENGTH_SHORT).show();
        });

        buttonGoToSecondActivity.setOnClickListener(v -> {
            startActivity(intent);
            finish();
        });
    }
}