package com.example.exp_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddCustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_customer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.button_Add_Customer), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /////////////define spinner//////////////
        String[] options={"MALE", "FEMALE"};
        final Spinner genderSpinner =(Spinner) findViewById(R.id.spinner_Gender);
        ArrayAdapter<String> objGenderArr = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, options);
        genderSpinner.setAdapter(objGenderArr);
        //////////////////////////////////////////

        //////////FIND TEXT VIEWS//////////////
        final EditText idEditText = (EditText)findViewById(R.id.editText_Id);
        final EditText nameEditText = (EditText)findViewById(R.id.editText_Name);
        final EditText phoneEditText = (EditText)findViewById(R.id.editText_Phone);
        /////////////////////////////////////

        Button addCustomerButton = (Button) findViewById(R.id.button_Add_Customer);
        addCustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            { Customer newCustomer =new Customer();
                if(idEditText.getText().toString().isEmpty())
                    newCustomer.setmCustomerId(0);
                else
                    newCustomer.setmCustomerId(Long.parseLong(idEditText.getText().toString()));

                if(nameEditText.getText().toString().isEmpty())
                    newCustomer.setmName("No Name");
                else
                    newCustomer.setmName(nameEditText.getText().toString());

                if(phoneEditText.getText().toString().isEmpty())
                    newCustomer.setmPhone("No Phone");
                else newCustomer.setmPhone(phoneEditText.getText().toString());

                newCustomer.setmGender(genderSpinner.getSelectedItem().toString());
                Customer.customersArrayList.add(newCustomer);

                Intent intent=new Intent(AddCustomerActivity.this,MainActivity.class);
                AddCustomerActivity.this.startActivity(intent);
                finish();
            }
        }
        );


    }
}