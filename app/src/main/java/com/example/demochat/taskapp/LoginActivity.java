package com.example.demochat.taskapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

import com.example.demochat.taskapp.preferences.SharedPreferenceHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 10/7/2018.
 */

public class LoginActivity extends AppCompatActivity {

   private TextInputEditText  emailidedittext;
   private TextInputEditText password;
   private Button login_button;
   private ConstraintLayout loginlayoutcontainer;

//test@mivi.com
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
         setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailidedittext=findViewById(R.id.emailid_edittext);
        password=findViewById(R.id.password);
        login_button=findViewById(R.id.login_button);
        loginlayoutcontainer=findViewById(R.id.loginlayoutcontainer);

      String loginstatus=  SharedPreferenceHelper.getLoginsaved(getApplicationContext());

      if(loginstatus.equals("success")) {
          Intent intent=new Intent(LoginActivity.this,SplashActivity.class);
          startActivity(intent);
          finish();

      }



        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    InputMethodManager imm = (InputMethodManager) getApplicationContext().getSystemService(Activity.INPUT_METHOD_SERVICE);
                    assert imm != null;
                    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                catch (Exception e){
                    e.printStackTrace();
                }

              String email=  emailidedittext.getText().toString();
               String enterpassword=   password.getText().toString();



                try {
                    String json=   readJSONFileFromAsset();
                    JSONObject jsonObject=new JSONObject(json);
               JSONObject dataattribute=     jsonObject.getJSONObject("data").getJSONObject("attributes");
                String miviemail=    dataattribute.getString("email-address");


                    if(!email.isEmpty() &&!enterpassword.isEmpty()) {
                    if(email.equals("test@mivi.com")) {

                       String firstname= dataattribute.getString("first-name");
                        String lastname= dataattribute.getString("last-name");
                        String dob= dataattribute.getString("date-of-birth");
                        String contactno= dataattribute.getString("contact-number");

                        SharedPreferenceHelper.savecustomername(getApplicationContext(),firstname+" "+lastname);
                        SharedPreferenceHelper.savecustomerdob(getApplicationContext(),dob);

                        SharedPreferenceHelper.savecustomercontact(getApplicationContext(),contactno);

                        SharedPreferenceHelper.savecustomeremail(getApplicationContext(),miviemail);



                        JSONArray includedarray= jsonObject.getJSONArray("included");

                         //subscription deatils
                            JSONObject subscriptiondetail = includedarray.getJSONObject(1);
                             String id = subscriptiondetail.getString("id");
                            JSONObject subsciptionObject = subscriptiondetail.getJSONObject("attributes");
                             long balance = subsciptionObject.getLong("included-data-balance");


                            SharedPreferenceHelper.saveSubscriptionid(getApplicationContext(),id);
                            SharedPreferenceHelper.saveSubscriptionbalanace(getApplicationContext(),String.valueOf(balance));

                            //product deatils

                            JSONObject productdeatils = includedarray.getJSONObject(2);
                            JSONObject productionattribute = productdeatils.getJSONObject("attributes");
                             Long price = productionattribute.getLong("price");
                             String name = productionattribute.getString("name");

                            SharedPreferenceHelper.saveProductprice(getApplicationContext(),String.valueOf(price));
                            SharedPreferenceHelper.saveProductname(getApplicationContext(),name);


                            SharedPreferenceHelper.saveLoginsaved(getApplicationContext(),"success");

                            Intent intent=new Intent(LoginActivity.this,SplashActivity.class);
                            startActivity(intent);
                            finish();


                        }
                        else {
                        Snackbar.make(loginlayoutcontainer,"Please enter correct email",Snackbar.LENGTH_LONG).show();

                    }

                    }
                    else {
                    Snackbar.make(loginlayoutcontainer,"Please enter field",Snackbar.LENGTH_LONG).show();

                }

                }
                catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        });



    }


    public String readJSONFileFromAsset() {
        String myjsonstring = null;
        StringBuffer sb = new StringBuffer();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(getAssets().open(
                    "collection.json")));
            String temp;
            while ((temp = br.readLine()) != null)
                sb.append(temp);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(br != null)
                    br.close(); // stop reading
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        myjsonstring = sb.toString();
        return myjsonstring;
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
