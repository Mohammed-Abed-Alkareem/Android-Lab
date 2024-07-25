package com.example.tweenanimationapplication;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
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


        Button buttonRotate = findViewById(R.id.button_rotate);
        Button buttonScale = findViewById(R.id.button_scale);
        Button buttonTranslate = findViewById(R.id.button_translate);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);

        buttonRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate));
            }
        });

        buttonScale.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                imageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale));
            }
        });

        buttonTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate));
            }
        });







    }
}