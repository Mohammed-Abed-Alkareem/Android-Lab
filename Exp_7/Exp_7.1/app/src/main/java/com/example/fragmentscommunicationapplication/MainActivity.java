package com.example.fragmentscommunicationapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fragmentscommunicationapplication.FirstFragment;
import com.example.fragmentscommunicationapplication.R;
import com.example.fragmentscommunicationapplication.SecondFragment;

public class MainActivity extends AppCompatActivity implements SecondFragment.communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public void respond (String data ){
        SecondFragment secondFragment = (SecondFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        if (secondFragment != null) {
            secondFragment.changeData(data);
        }
    }

}
