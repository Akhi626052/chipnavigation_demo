package com.daizzyinfo.chipnavigation_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.daizzyinfo.chipnavigation_demo.Model.LoginWithPassResponse;
import com.daizzyinfo.chipnavigation_demo.retrofit.ApiRequest;
import com.daizzyinfo.chipnavigation_demo.retrofit.RetrofitRequest;
import com.goodiebag.pinview.Pinview;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Passcode extends AppCompatActivity {

    TextView btn_submit_;
    Pinview pinViewPass;
    TextView text_value;
    List<LoginWithPassResponse> loginResponses= new ArrayList<LoginWithPassResponse>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passcode);

        btn_submit_=findViewById(R.id.btn_submit_);
        pinViewPass=findViewById(R.id.pinViewPass);
        text_value=findViewById(R.id.text_value);

      //  String data = getIntent().getExtras().getString("mobile","1");
  //   text_value.setText(getIntent().getExtras().getString("mobile","Number"));
       // text_value.setText(data);

        getData();

        initOnClick();



    }
    private void initOnClick() {

        btn_submit_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(pinViewPass.getValue().length()<4 )
                {

                      Toast.makeText(Passcode.this, "Please Enter Valid Passcode", Toast.LENGTH_SHORT).show();

                }
                else {

                    //loginWithPasscode();
                    Intent intent   = new Intent(Passcode.this,BottomNavigtionChipbar.class);
                    startActivity(intent);

                }

            }
        });

    }




/*    private void loginWithPasscode() {

        JsonObject jsonObject = new JsonObject();

        //pinViewPass.setText(getIntent().getStringExtra("mobile"));
        //text_value.setText(getIntent().getStringExtra("1").toString());
        //get mobile in intent

        jsonObject.addProperty("mobile",getIntent().getStringExtra("mobile"));
        text_value.setText(getIntent().getExtras().getString("mobile","Number"));
        jsonObject.addProperty("password",pinViewPass.getValue().toString());

        Log.e("Passcode","number - " + getIntent().getStringExtra("mobile"));
        Log.e("Passcode","password - " + getIntent().getStringExtra("mobile"));
        Log.e("Passcode","passcode - " + pinViewPass.getValue().toString());


        ApiRequest apiRequest = RetrofitRequest.getRetrofit().create(ApiRequest.class);
        Call<LoginWithPassResponse> call = apiRequest.LoginWithPasscodeAPI(jsonObject);
        call.enqueue(new Callback<LoginWithPassResponse>() {


            @Override
            public void onResponse(Call<LoginWithPassResponse> call, Response<LoginWithPassResponse> response) {

                if(response.code()==200 && response.body()!=null)
                {

                    Toast.makeText(Passcode.this, ""+response.body().getMessage(), Toast.LENGTH_SHORT).show();
                     Log.d("Passcode", "response 200");
                     Log.e("Passcode", "response 200"+getIntent().getStringExtra("mobile"));
                     Log.e("Passcode","Api ---"+response.body().getToken().toString());


                    SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                    SharedPreferences.Editor myEdit = sharedPreferences.edit();
                    // myEdit.putString("name","Shekhar");
                    myEdit.putString("Token",response.body().getToken().toString());





                    if(response.body().getMessage().equals("Customer Logged In Successfully")){


                        Intent intent   = new Intent(Passcode.this,BottomNavigtionChipbar.class);
                        startActivity(intent);



                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent i = new Intent(getApplicationContext(),BottomNavigtionChipbar.class);
                                startActivity(i);

                            }
                        },300);
                    }


                }
                else {


                    Toast.makeText(Passcode.this, "failure"+response.code(), Toast.LENGTH_SHORT).show();



                }

            }

            @Override
            public void onFailure(Call<LoginWithPassResponse> call, Throwable t) {


                Toast.makeText(Passcode.this, "Something Went Wrong ", Toast.LENGTH_SHORT).show();


            }
        });




    }*/







    private void getData() {

        Intent i = getIntent();

        if(i!=null) {

            String Number = i.getStringExtra("Number");

        }
        else {
            Toast.makeText(this, "Something Went Wrong", Toast.LENGTH_SHORT).show();
            finish();
        }

    }





}