package com.example.fragmentstransactionapplication;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button addFirstFragment, addSecondFragment,
            removeFirstFragment, removeSecondFragment,
            attachFirstFragment, detachFirstFragment,
            replaceFirstFragment, replaceSecondFragment;

    final FirstFragment firstFragment = new FirstFragment();
    final SecondFragment secondFragment = new SecondFragment();
    final FragmentManager fragmentManager = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
               setContentView(R.layout.activity_main);

        addFirstFragment = findViewById(R.id.add_first_fragment_button);
        addSecondFragment = findViewById(R.id.add_second_fragment_button);

        removeFirstFragment = findViewById(R.id.remove_first_fragment_button);
        removeSecondFragment = findViewById(R.id.remove_second_fragment_button);

        attachFirstFragment = findViewById(R.id.attach_first_fragment_button);
        detachFirstFragment = findViewById(R.id.detach_first_fragment_button);

        replaceFirstFragment = findViewById(R.id.replace_first_second_button);
        replaceSecondFragment = findViewById(R.id.replace_second_first_button);

        addFirstFragment.setOnClickListener(v -> {

            if (fragmentManager.findFragmentByTag("FirstFrag") != null) {
                return;
            }
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.main, firstFragment, "FirstFrag");
            fragmentTransaction.commit();
        });

        addSecondFragment.setOnClickListener(v -> {
            if (fragmentManager.findFragmentByTag("SecondFrag") != null) {
                return;
            }
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.main, secondFragment, "SecondFrag");
            fragmentTransaction.commit();
        });

        removeFirstFragment.setOnClickListener(v -> {

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(firstFragment);
            fragmentTransaction.commit();
        });

        removeSecondFragment.setOnClickListener(v -> {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(secondFragment);
            fragmentTransaction.commit();
        });

        attachFirstFragment.setOnClickListener(v -> {

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.attach(firstFragment);
            fragmentTransaction.commit();
        });

        detachFirstFragment.setOnClickListener(v -> {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.detach(firstFragment);
            fragmentTransaction.commit();
        });

        replaceFirstFragment.setOnClickListener(v -> {
            if (fragmentManager.findFragmentByTag("FirstFrag") == null || fragmentManager.findFragmentByTag("SecondFrag") != null){
                return;
            }

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.main, secondFragment);
            fragmentTransaction.commit();
        });

        replaceSecondFragment.setOnClickListener(v -> {
            if (fragmentManager.findFragmentByTag("SecondFrag") == null || fragmentManager.findFragmentByTag("FirstFrag") != null){
                return;
            }
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.main, firstFragment);
            fragmentTransaction.commit();
        });


    }
}