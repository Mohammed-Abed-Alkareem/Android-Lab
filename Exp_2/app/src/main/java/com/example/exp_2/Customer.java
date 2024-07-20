package com.example.exp_2;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Customer {
    public static ArrayList<Customer> customersArrayList = new ArrayList<Customer>();
    private long mCustomerId ;
    private String mName;
    private String mPhone;
    private String mGender;
    private String mCountry;

    public Customer(){}

    public Customer(long customerId, String name, String mPhone, String mGender, String mCountry) {
        this.mCustomerId = customerId;
        this.mName = name;
        this.mPhone = mPhone;
        this.mGender = mGender;
        this.mCountry = mCountry;
    }

    public long getmCustomerId() {
        return mCustomerId;
    }

    public void setmCustomerId(long mCustomerId) {
        this.mCustomerId = mCustomerId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmGender() {
        return mGender;
    }

    public void setmGender(String mGender) {
        this.mGender = mGender;
    }

    public String getmCountry() {
        return mCountry;
    }

    public void setmCountry(String mCountry) {
        this.mCountry = mCountry;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "\nmCustomerId=" + mCustomerId +
                "\n, mName='" + mName + '\'' +
                "\n, mPhone='" + mPhone + '\'' +
                "\n, mGender='" + mGender + '\'' +
                "\n, mCountry='" + mCountry + '\'' +
                 "\n}\n\n";
    }
}


