package com.example.exp_2;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private LinearLayout secondLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create layout elements
        LinearLayout firstLinearLayout = new LinearLayout(this);
        Button addButton = new Button(this);
        secondLinearLayout = new LinearLayout(this);

        ScrollView scrollView = new ScrollView(this);

        // Configure layouts
        firstLinearLayout.setOrientation(LinearLayout.VERTICAL);
        secondLinearLayout.setOrientation(LinearLayout.VERTICAL);

        // Style Add Customer button
        addButton.setText("Add Customer");
        LinearLayout.LayoutParams buttonLayoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        buttonLayoutParams.setMargins(20, 20, 20, 20); // Add margins around button
        addButton.setLayoutParams(buttonLayoutParams);

        // Style main layout
        firstLinearLayout.setPadding(20, 20, 20, 20); // Add padding to the layout

        // Add views to layout
        firstLinearLayout.addView(addButton);
        scrollView.addView(secondLinearLayout);
        firstLinearLayout.addView(scrollView);

        setContentView(firstLinearLayout);

        // Handle button click
        addButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddCustomerActivity.class);
            MainActivity.this.startActivity(intent);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        DataBaseHelper dataBaseHelper = new DataBaseHelper(MainActivity.this, "EXP4", null, 1);
        Cursor allCustomersCursor = dataBaseHelper.getAllCustomers();
        secondLinearLayout.removeAllViews();

        /////todo//////////////
        Cursor letterCustomersCursor = dataBaseHelper.getCustomerByFirstLetter('B');

        TextView textViewCustomer = new TextView(MainActivity.this);

        textViewCustomer.setPadding(20, 20, 20, 20); // Add padding to TextView
        LinearLayout.LayoutParams textViewLayoutParamsCustomer = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        textViewLayoutParamsCustomer.setMargins(10, 10, 10, 10); // Add margins around TextView
        textViewCustomer.setLayoutParams(textViewLayoutParamsCustomer);
        textViewCustomer.setBackgroundColor(getResources().getColor(android.R.color.darker_gray)); // Set background color
        textViewCustomer.setTextColor(getResources().getColor(android.R.color.white)); // Set text color

        if (letterCustomersCursor != null) {
            try {
                if (letterCustomersCursor.moveToLast()) {
                    int index = letterCustomersCursor.getColumnIndex("PHONE");
                    if (index != -1) {
                        String customerPhone = letterCustomersCursor.getString(index);
                        textViewCustomer.setText("ToDo: \n"+"Phone: " + customerPhone);
                    }
                    else {
                        textViewCustomer.setText("Column 'PHONE' not found");
                    }
                }
                else {
                    textViewCustomer.setText("No customers found starting with B");
                }
            }
            catch (Exception e) {
                Toast.makeText(MainActivity.this, "Error getting customers starting with B: " + e.getMessage(), Toast.LENGTH_LONG).show();
            } finally {
                letterCustomersCursor.close();
            }
        } else {
            textViewCustomer.setText("No customers found");
        }

        secondLinearLayout.addView(textViewCustomer);


        ///////////////////////////

        if (allCustomersCursor != null) {

            try {
                while (allCustomersCursor.moveToNext()) {
                    String customerId = allCustomersCursor.getString(0);
                    String customerName = allCustomersCursor.getString(1);
                    String customerPhone = allCustomersCursor.getString(2);
                    String customerGender = allCustomersCursor.getString(3);
                    String customerCountry = allCustomersCursor.getString(4);


                    // Style each TextView for customer details
                    TextView textView = new TextView(MainActivity.this);
                    textView.setText("Id: " + customerId + "\nName: " + customerName + "\nPhone: " + customerPhone + "\nGender: " + customerGender + "\nCountry: " + customerCountry);
                    textView.setPadding(20, 20, 20, 20); // Add padding to TextView
                    LinearLayout.LayoutParams textViewLayoutParams = new LinearLayout.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT
                    );
                    textViewLayoutParams.setMargins(10, 10, 10, 10); // Add margins around TextView
                    textView.setLayoutParams(textViewLayoutParams);
                    textView.setBackgroundColor(getResources().getColor(android.R.color.darker_gray)); // Set background color
                    textView.setTextColor(getResources().getColor(android.R.color.white)); // Set text color

                    secondLinearLayout.addView(textView);
                }
            } finally {
                allCustomersCursor.close();
            }
        }
    }
}
