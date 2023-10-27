package com.daizzyinfo.chipnavigation_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.RelativeLayout;

public class Setting extends AppCompatActivity {
RelativeLayout my_profile,notification,change_passcode,contact_with_us,terms_and_conditions,privacy_policy,helps_and_FAQs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        my_profile=findViewById(R.id.my_profile);
        change_passcode=findViewById(R.id.change_passcode);
        contact_with_us=findViewById(R.id.contact_with_us);
        notification=findViewById(R.id.notification);

        MyProfileNext();


    }
    public void MyProfileNext(){

        my_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent=new Intent(Setting.this,MyProfiles.class);
             startActivity(intent);
            }
        });

        change_passcode.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v) {
             Intent intent=new Intent(Setting.this,ChangePassword.class);
             startActivity(intent);

         }
        });


        contact_with_us.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {

            Intent intent=new Intent(Setting.this,ContactWithUs.class);
            startActivity(intent);

            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Setting.this, notification.class);
                startActivity(intent);

            }
        });



    }

}