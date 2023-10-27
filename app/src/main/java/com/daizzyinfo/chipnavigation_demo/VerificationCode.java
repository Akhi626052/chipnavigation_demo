package com.daizzyinfo.chipnavigation_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.daizzyinfo.chipnavigation_demo.Model.LoginWithPassResponse;
import com.daizzyinfo.chipnavigation_demo.retrofit.ApiRequest;
import com.daizzyinfo.chipnavigation_demo.retrofit.RetrofitRequest;
import com.goodiebag.pinview.Pinview;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VerificationCode extends AppCompatActivity {
    TextView btn_submit_;
    Pinview pinViewPass;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code);
        btn_submit_=findViewById(R.id.btn_submit_);
        pinViewPass=findViewById(R.id.pinViewPass);


        // next screen click lis.
        btn_submit_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

           /* Intent intent = new Intent(VerificationCode.this,BottomNavigtionChipbar.class);
                startActivity(intent); */

            }
        });











    }






}