package com.daizzyinfo.chipnavigation_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.daizzyinfo.chipnavigation_demo.Model.StateDataModel;
import com.daizzyinfo.chipnavigation_demo.retrofit.ApiRequest;
import com.daizzyinfo.chipnavigation_demo.retrofit.RetrofitRequest;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Filter extends AppCompatActivity {

    List<StateDataModel> stateData=new ArrayList<StateDataModel>();
    ArrayList<String> arrIds = new ArrayList<>();


  AppCompatSpinner drop_city_id2, drop_category_id3, drop_courts_id4, drop_Experience_id5, drop_ratings_id6, drop_gender_id7;
  Spinner drop_state_id1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        drop_state_id1=findViewById(R.id.drop_state_id1);

        arrIds.add("Select State");
        StateMethod();

    }

    public void StateMethod(){

        ApiRequest request = (ApiRequest) RetrofitRequest.getRetrofit().create(ApiRequest.class);
        Call<StateDataModel> call = request.getState("28|G8yvRAZ4Q3X5Wm9VQsjwIS6KCDCW7WBC8t3S4x0S");

        call.enqueue(new Callback<StateDataModel>() {


            @Override
            public void onResponse(Call<StateDataModel> call, Response<StateDataModel> response) {

                Log.e("MainActivity","onResponse "+response.body());
                Log.e("MainActivity","onResponse "+response.body().getData().get(0).toString());

                StateDataModel response1=response.body();
                stateData.add(response1);

                if (response.body().getData().size() <= 0){

                    Toast.makeText(Filter.this, "Data not found", Toast.LENGTH_SHORT).show();


                }
                else{

                    for(int i =0; i < response.body().getData().size();i++) {

                        drop_state_id1=findViewById(R.id.drop_state_id1);
                        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(Filter.this,  android.R.layout.simple_list_item_1,arrIds);
                        drop_state_id1.setAdapter(spinnerAdapter);

//                        Log.e("MainActivity", "success################# "+response.body().getData().get(i).toString());
//                        Log.e("MainActivity", "success country------ "+response1.getData().get(i).getCountryName());
                          Log.e("MainActivity", "success stateName     "+response.body().getData().get(i).getStateName());
//                        Log.e("MainActivity", "success state                   "+response.body().getData().get(i).getStatus());
                          arrIds.add(response.body().getData().get(i).getStateName());
                          spinnerAdapter.notifyDataSetChanged();


//                        arrIds.add(response.body().getData().get(i).getStatus().toString());
//                        arrIds.add((String) response.body().getData().get(i).getCountryName());
//                        arrIds.add((String) response.body().getData().get(i).getCreatedAt().toString());
//                        arrIds.add((String) response.body().getData().get(i).getUpdatedAt().toString());


                 }

                }

            }



            public void onFailure(Call<StateDataModel> call, Throwable t) {


                Log.e("MainActivity","onFailure"+t.getMessage().toString());


            }
        });



    }



    }
