package com.example.demochat.taskapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.demochat.taskapp.preferences.SharedPreferenceHelper;

public class MainActivity extends AppCompatActivity {

    private TextView customer_name;
    private TextView dateofbirth;
    private TextView contactnumber;
    private TextView subscriptionid;
    private TextView subscriptionbalance;
    private TextView product_name;
    private TextView product_price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customer_name=findViewById(R.id.customer_name);
        dateofbirth=findViewById(R.id.dateofbirth);
        contactnumber=findViewById(R.id.contactnumber);
        subscriptionid=findViewById(R.id.subscriptionid);
        subscriptionbalance=findViewById(R.id.subscriptionbalance);
        product_name=findViewById(R.id.product_name);
        product_price=findViewById(R.id.product_price);


      String contact_number=  SharedPreferenceHelper.getcustomercontact(getApplicationContext());
        contactnumber.setText(contact_number);

       String dob= SharedPreferenceHelper.getcustomerdob(getApplicationContext());
        dateofbirth.setText(dob);



      String customer_user=  SharedPreferenceHelper.getcustomername(getApplicationContext());
        customer_name.setText(customer_user);


      String subscription=  SharedPreferenceHelper.getSubscriptionId(getApplicationContext());
        subscriptionid.setText(subscription);

     String balance_sub=   SharedPreferenceHelper.getSubscriptionbalanace(getApplicationContext());
        subscriptionbalance.setText(balance_sub);


       String nameofproduct= SharedPreferenceHelper.getProductName(getApplicationContext());
        product_name.setText(nameofproduct);

       String priceofproduct= SharedPreferenceHelper.getProductPrice(getApplicationContext());
        product_price.setText(priceofproduct);



    }
}
