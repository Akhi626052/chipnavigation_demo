package com.daizzyinfo.chipnavigation_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sign_Up extends AppCompatActivity {
    TextView signup_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        signup_bt=findViewById(R.id.signup_bt);
        signup_bt.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }
        });



    }
}