package com.example.exp_2;

import android.content.Intent;
import android.database.sqlite.SQLiteConstraintException;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddCustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);

        // Define spinner for gender
        String[] genderOptions = {"MALE", "FEMALE"};
        Spinner genderSpinner = findViewById(R.id.spinner_Gender);
        ArrayAdapter<String> genderAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, genderOptions);
        genderSpinner.setAdapter(genderAdapter);

        // Define spinner for country
        String[] countryOptions = {"Palestine", "Spain", "USA"};
        Spinner countrySpinner = findViewById(R.id.spinner_Country);
        ArrayAdapter<String> countryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, countryOptions);
        countrySpinner.setAdapter(countryAdapter);

        // Find text fields
        final EditText idEditText = findViewById(R.id.editText_Id);
        final EditText nameEditText = findViewById(R.id.editText_Name);
        final EditText phoneEditText = findViewById(R.id.editText_Phone);

        Button addCustomerButton = findViewById(R.id.button);
        addCustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Customer newCustomer = new Customer();
                    if (idEditText.getText().toString().isEmpty())
                        newCustomer.setmCustomerId(0);
                    else
                        newCustomer.setmCustomerId(Long.parseLong(idEditText.getText().toString()));

                    if (nameEditText.getText().toString().isEmpty())
                        newCustomer.setmName("No Name");
                    else
                        newCustomer.setmName(nameEditText.getText().toString());

                    if (phoneEditText.getText().toString().isEmpty())
                        newCustomer.setmPhone("No Phone");
                    else
                        newCustomer.setmPhone(phoneEditText.getText().toString());

                    newCustomer.setmGender(genderSpinner.getSelectedItem().toString());
                    newCustomer.setmCountry(countrySpinner.getSelectedItem().toString());

                    // Insert into database
                    DataBaseHelper dataBaseHelper = new DataBaseHelper(AddCustomerActivity.this, "EXP4", null, 1);
                    dataBaseHelper.insertCustomer(newCustomer);

                    // Display success message and navigate to MainActivity
                    Toast.makeText(AddCustomerActivity.this, "Customer added successfully!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AddCustomerActivity.this, MainActivity.class);
                    AddCustomerActivity.this.startActivity(intent);
                    finish();
                } catch (SQLiteConstraintException e) {
                    // Display error message
                    Toast.makeText(AddCustomerActivity.this, "Error: Customer ID already exists.", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    // Display generic error message
                    Toast.makeText(AddCustomerActivity.this, "Error adding customer: " + e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
