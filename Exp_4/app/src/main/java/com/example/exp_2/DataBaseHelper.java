package com.example.exp_2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

public class DataBaseHelper extends android.database.sqlite.SQLiteOpenHelper {

    private Context context; // Context to show Toast messages

    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.context = context; // Initialize the context
    }

    // Called when the database is created for the first time
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            // Drop the CUSTOMER table if it already exists
            String dropTable = "DROP TABLE IF EXISTS CUSTOMER";
            sqLiteDatabase.execSQL(dropTable); // Execute the SQL statement to drop the table

            // Create the CUSTOMER table
            String createTable = "CREATE TABLE IF NOT EXISTS CUSTOMER (" +
                    "id LONG PRIMARY KEY," +
                    "NAME TEXT, " +
                    "PHONE TEXT, " +
                    "GENDER TEXT, " +
                    "COUNTRY TEXT)";
            sqLiteDatabase.execSQL(createTable); // Execute the SQL statement
        } catch (Exception e) {
            // Show a Toast message if there is an error creating the table
            Toast.makeText(context, "Error creating table: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Handle database upgrade
    }

    public void insertCustomer(Customer customer) throws SQLiteConstraintException {
        SQLiteDatabase sqLiteDatabase = null;
        try {
            sqLiteDatabase = this.getWritableDatabase(); // Get a writable database
            ContentValues values = new ContentValues(); // Create a ContentValues object to hold the customer data
            values.put("id", customer.getmCustomerId());
            values.put("NAME", customer.getmName());
            values.put("PHONE", customer.getmPhone());
            values.put("GENDER", customer.getmGender());
            values.put("COUNTRY", customer.getmCountry());

            sqLiteDatabase.insertOrThrow("CUSTOMER", null, values); // Insert the customer data into the CUSTOMER table
        } catch (SQLiteConstraintException e) {
            throw e; // Re-throw the SQLiteConstraintException to be caught in the calling activity
        } catch (SQLException e) {
            // Show a Toast message if there is an error inserting the customer data
            Toast.makeText(context, "Error inserting customer: " + e.getMessage(), Toast.LENGTH_LONG).show();
        } finally {
            // Close the database if it is open
            if (sqLiteDatabase != null && sqLiteDatabase.isOpen()) {
                sqLiteDatabase.close();
            }
        }
    }

    public Cursor getAllCustomers() {
        SQLiteDatabase sqLiteDatabase = null;
        Cursor cursor = null;
        try {
            sqLiteDatabase = this.getReadableDatabase();
            cursor = sqLiteDatabase.rawQuery("SELECT * FROM CUSTOMER", null);
        } catch (SQLException e) {
            // Show a Toast message if there is an error getting all customers
            Toast.makeText(context, "Error getting all customers: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
        return cursor;
    }

    // todo code
    public Cursor getCustomerByFirstLetter(char firstLetter){
        SQLiteDatabase sqLiteDatabase = null;
        Cursor cursor = null;
        String query = "SELECT * FROM CUSTOMER WHERE NAME LIKE '" + firstLetter + "%'";
        try {
            sqLiteDatabase = this.getReadableDatabase();
            cursor = sqLiteDatabase.rawQuery(query, null);
        } catch (SQLException e) {
            // Show a Toast message if there is an error getting all customers
            Toast.makeText(context, "Error getting customers starting with "+ firstLetter + e.getMessage(), Toast.LENGTH_LONG).show();
        }
        return cursor;
    }


}
