package com.example.demochat.taskapp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;


public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Window window = getWindow();


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.colorAccent));
        }

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },1000);
    }

    @Override
    protected void onStart() {
        super.onStart();

        /*
        {
  "data": {
    "type": "accounts",
    "id": "2593177",
    "attributes": {
      "payment-type": "prepaid",
      "unbilled-charges": null,
      "next-billing-date": null,
      "title": "Ms",
      "first-name": "Joe",
      "last-name": "Bloggs",
      "date-of-birth": "1985-01-01",
      "contact-number": "0404000000",
      "email-address": "test@mivi.com",
      "email-address-verified": false,
      "email-subscription-status": false
    },
    "links": {
      "self": "http://localhost:3000/accounts/2593177"
    },
    "relationships": {
      "services": {
        "links": {
          "related": "http://localhost:3000/services/0468874507"
        }
      }
    }
  },
  "included": [
    {
      "type": "services",
      "id": "0468874507",
      "attributes": {
        "msn": "0468874507",
        "credit": 1200,
        "credit-expiry": "2016-11-20",
        "data-usage-threshold": false
      },
      "links": {
        "self": "http://localhost:3000/services/0468874507"
      },
      "relationships": {
        "subscriptions": {
          "links": {
            "related": "http://localhost:3000/services/0468874507/subscriptions"
          },
          "data": [
            {
              "type": "subscriptions",
              "id": "0468874507-0"
            }
          ]
        }
      }
    },
    {
      "type": "subscriptions",
      "id": "0468874507-0",
      "attributes": {
        "included-data-balance": 52400,
        "included-credit-balance": null,
        "included-rollover-credit-balance": null,
        "included-rollover-data-balance": null,
        "included-international-talk-balance": null,
        "expiry-date": "2016-11-19",
        "auto-renewal": true,
        "primary-subscription": true
      },
      "links": {
        "self": "http://localhost:3000/services/0468874507/subscriptions/0468874507-0"
      },
      "relationships": {
        "service": {
          "links": {
            "related": "http://localhost:3000/services/0468874507"
          }
        },
        "product": {
          "data": {
            "type": "products",
            "id": "0"
          }
        },
        "downgrade": {
          "data": null
        }
      }
    },
    {
      "type": "products",
      "id": "4000",
      "attributes": {
        "name": "UNLIMITED 7GB",
        "included-data": null,
        "included-credit": null,
        "included-international-talk": null,
        "unlimited-text": true,
        "unlimited-talk": true,
        "unlimited-international-text": false,
        "unlimited-international-talk": false,
        "price": 3990
      }
    }
  ]
}
        * */
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
