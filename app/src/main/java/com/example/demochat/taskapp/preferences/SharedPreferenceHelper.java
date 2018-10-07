package com.example.demochat.taskapp.preferences;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Admin on 10/7/2018.
 */

public class SharedPreferenceHelper {


    private static final String mSharedPrefs="savedata";

    private static final String SUBSCRIPTION_ID="suscription_id";
    private static final String SUBSCRIPTION_BALANACE="suscription_balance";
    private static final String PRODUCTPRICE="productprice";
    private static final String PRODUCTNAME="productname";

    private static final String Customer_name="username";
    private static final String Customer_contact="customer_contact";
    private static final String Customer_dob="dateofbirth";
    private static final String Customer_email="customeremail";

    private static final String loginsaved="login";



    public static String  getLoginsaved(Context context) {
        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        return settings.getString(loginsaved, "");
    }

    public static void saveLoginsaved(Context context,String value) {

        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(loginsaved, value);
        editor.apply();

    }


    //customer name
    public static String getcustomername(Context context) {
        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        return settings.getString(Customer_name, "");
    }

    public static void savecustomername(Context context,String value) {

        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(Customer_name, value);
        editor.apply();

    }


    //customer dob
    public static String getcustomercontact(Context context) {
        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        return settings.getString(Customer_contact, "");
    }

    public static void savecustomercontact(Context context,String value) {

        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(Customer_contact, value);
        editor.apply();

    }



    //customer dob
    public static String getcustomerdob(Context context) {
        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        return settings.getString(Customer_dob, "");
    }

    public static void savecustomerdob(Context context,String value) {

        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(Customer_dob, value);
        editor.apply();

    }


    //customer email
    public static String getcustomeremail(Context context) {
        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        return settings.getString(Customer_email, "");
    }

    public static void savecustomeremail(Context context,String value) {

        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(Customer_email, value);
        editor.apply();

    }



    //product name
    public static String getProductName(Context context) {
        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        return settings.getString(PRODUCTNAME, "");
    }

    public static void saveProductname(Context context,String value) {

        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(PRODUCTNAME, value);
        editor.apply();

    }



    //product price
    public static String getProductPrice(Context context) {
        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        return settings.getString(PRODUCTPRICE, "");
    }

    public static void saveProductprice(Context context,String value) {

        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(PRODUCTPRICE, value);
        editor.apply();

    }



    //subscription id
    public static String getSubscriptionId(Context context) {
        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        return settings.getString(SUBSCRIPTION_ID, "");
    }

    public static void saveSubscriptionid(Context context,String value) {

        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(SUBSCRIPTION_ID, value);
        editor.apply();

    }

    //subscription id
    public static String getSubscriptionbalanace(Context context) {
        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        return settings.getString(SUBSCRIPTION_BALANACE, "");
    }

    public static void saveSubscriptionbalanace(Context context,String value) {

        SharedPreferences settings = context.getSharedPreferences(mSharedPrefs, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(SUBSCRIPTION_BALANACE, value);
        editor.apply();

    }

}
