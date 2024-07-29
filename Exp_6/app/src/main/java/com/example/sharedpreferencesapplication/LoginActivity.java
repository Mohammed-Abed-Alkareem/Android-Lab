package com.example.sharedpreferencesapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity  extends AppCompatActivity {

    EditText editTextUserName;
    EditText editTextPassword;
    Button buttonLogin;
    Button buttonGoToMainActivity;
    TextView textViewStatus;

    SharedPrefManager sharedPrefManager;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        editTextUserName = (EditText) findViewById(R.id.editTextUserName);
        editTextPassword = (EditText) findViewById(R.id.editText_password);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        textViewStatus = (TextView) findViewById(R.id.textView2);
buttonGoToMainActivity = (Button) findViewById(R.id.buttonBackToMainActivity);
        sharedPrefManager = SharedPrefManager.getInstance(this);
        intent = new Intent(LoginActivity.this, MainActivity.class);

        buttonLogin.setOnClickListener(v -> {
            String userName = editTextUserName.getText().toString();
            String password = Hash.hashPassword(editTextPassword.getText().toString());
            String storedUserName = sharedPrefManager.readString("userName", "noValue");
            String storedPassword = sharedPrefManager.readString("password", "noValue");

            if (userName.equals(storedUserName) && password.equals(storedPassword)) {
                textViewStatus.setText("Login Successful");
                textViewStatus.setTextColor(getResources().getColor(R.color.green));
            } else {
                textViewStatus.setText("Login Failed");
                textViewStatus.setTextColor(getResources().getColor(R.color.red));
            }
        });

        buttonGoToMainActivity.setOnClickListener(v -> {
            startActivity(intent);
            finish();
        });
    }

}
