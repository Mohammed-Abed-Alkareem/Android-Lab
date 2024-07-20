package com.example.exp_2;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ///////////edited///////////
        LinearLayout firstLinearLayout=new LinearLayout(this);
        Button addButton =new Button(this);
        LinearLayout secondLinearLayout=new LinearLayout(this);
        ScrollView scrollView=new ScrollView(this);

        firstLinearLayout.setOrientation(LinearLayout.VERTICAL);
        secondLinearLayout.setOrientation(LinearLayout.VERTICAL);

        addButton.setText("Add Customer");
        addButton.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

        firstLinearLayout.addView(addButton);
        scrollView.addView(secondLinearLayout);
        firstLinearLayout.addView(scrollView);

        setContentView(firstLinearLayout);
        for(Customer objCustomer : Customer.customersArrayList) {
            TextView txtCustomerInfo = new TextView(this) ;
//            txtCustomerInfo.setTextAppearance(R.style.TextAppearance_AppCompat_Display1);
            txtCustomerInfo.setText(objCustomer.toString());
            secondLinearLayout .addView(txtCustomerInfo); }
        ///////////////////////////


        addButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,AddCustomerActivity.class);
            MainActivity.this.startActivity(intent);
            finish();
        }
        );
    }
}