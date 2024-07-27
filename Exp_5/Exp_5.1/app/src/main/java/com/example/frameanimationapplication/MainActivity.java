package com.example.frameanimationapplication;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        final ImageView imageView = findViewById(R.id.imageView);

        button.setOnClickListener(v -> {
            TransitionDrawable transitionDrawable = (TransitionDrawable) imageView.getDrawable();
                transitionDrawable.reverseTransition(1000);
        });


    }
}