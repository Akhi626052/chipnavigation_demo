package com.daizzyinfo.chipnavigation_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.daizzyinfo.chipnavigation_demo.Adapter.AllLawyersAdapter;
import com.daizzyinfo.chipnavigation_demo.Model.AllLawyersResponse;
import com.daizzyinfo.chipnavigation_demo.Model.LoginWithPassResponse;
import com.daizzyinfo.chipnavigation_demo.retrofit.ApiRequest;
import com.daizzyinfo.chipnavigation_demo.retrofit.RetrofitRequest;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {

    List<LoginWithPassResponse> loginWithPassResponses = new ArrayList<>();

    TextView submitLogin;
    EditText msgEdt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        submitLogin = findViewById(R.id.submitLogin);
        msgEdt=findViewById(R.id.msgEdt);
        PasscodeScNext();
        //LoginScAPI();


    }


    public void PasscodeScNext() {

        submitLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Number = msgEdt.getText().toString();


                Intent intent = new Intent(Login.this, Passcode.class);
                //JsonObject rootObject = new JsonObject();
                intent.putExtra("mobile",Number);
                startActivity(intent);




            }
        });
    }


/*    private static void writeJson() throws IOException {
        JsonObject rootObject = new JsonObject();
        rootObject.addProperty("Number",1);

*//*      JsonObject childObject = new JsonObject();
        childObject.addProperty("password", "World!");
        rootObject.add("place", childObject);*//*


    }*/




}






/*    public void LoginScAPI() {
        ApiRequest request = (ApiRequest) RetrofitRequest.getRetrofit().create(ApiRequest.class);
        Call<LoginWithPassResponse> call = new Call<LoginWithPassResponse>() {
            @Override
            public Response<LoginWithPassResponse> execute() throws IOException {
                return null;
            }

            @Override
            public void enqueue(Callback<LoginWithPassResponse> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<LoginWithPassResponse> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }

        };


    }*/








    /*public void AllLawMeth(){


        ApiRequest request = (ApiRequest) RetrofitRequest.getRetrofit().create(ApiRequest.class);
        Call<LoginWithPassResponse> call = request.getLoginWithPasscodeAPI("42|Gf15PWHqYTgc3O0LxGd8VlJBVAJsC5pT9SfopO9S");
        call.enqueue(new Callback<AllLawyersResponse>() {
            @Override
            public void onResponse(Call<AllLawyersResponse> call, Response<AllLawyersResponse> response) {

                Log.e("AllLawyers","onResponse "+response.body().getData().get(0).getName());

                AllLawyersResponse response1=response.body();

                if (response.body().getData().size() <= 0){


                    Toast.makeText(Login.this, "Data not found", Toast.LENGTH_SHORT).show();


                }
                else{

                    for(int i =0; i < response.body().getData().size();i++) {
                        allLawyersResponses.add(response1);

                        Log.e("AllLawyers", "success----------- "+response.body().getData().get(i).getName());
                        Log.e("AllLawyers", "success -----------------"+allLawyersResponses.get(0).getData().get(i).getExperience());

                    }

                    LinearLayoutManager lm = new LinearLayoutManager(AllLawyers.this,LinearLayoutManager.VERTICAL,false);
                    allawyers_rcy.setLayoutManager(lm);
                    AllLawyersAdapter adapter=new AllLawyersAdapter(allLawyersResponses,AllLawyers.this);
                    allawyers_rcy.setAdapter(adapter);
                    adapter.notifyDataSetChanged();

                }

            }

            @Override public void onFailure(Call<AllLawyersResponse> call, Throwable t) {

                Log.e("AllLawyersResponse","onFailurefkjd----------------------------------"+t.getMessage().toString());


            }
        });

    }*/




