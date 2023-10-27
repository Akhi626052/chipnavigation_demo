package com.daizzyinfo.chipnavigation_demo;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessaging;

public class SplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        FirebaseTokenAPI();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent intent  = new Intent(SplashScreen.this,Welcome_Screen.class);
                startActivity(intent);

            }
        }, 2500);

    }


    public void FirebaseTokenAPI() {


        FirebaseMessaging.getInstance().getToken().addOnSuccessListener(token -> {
            if (!TextUtils.isEmpty(token)) {
                Log.e(TAG, "retrieve token successful :------------------ " + token);

            } else{

                Log.e(TAG, "token should not be null... :--------------- " + token);

            }
        }).addOnFailureListener(e -> {
            //handle e
            Log.e(TAG, "addOnFailureListener :-------------------- " + e.getMessage());
        }).addOnCanceledListener(() -> {
            //handle cancel
            Log.e(TAG, "addOnCanceledListener :--------------------------------- ");

        }).addOnCompleteListener(task -> Log.e(TAG, "This is the token : " + task.getResult()));
        FirebaseMessaging.getInstance().setAutoInitEnabled(true);

    }

}