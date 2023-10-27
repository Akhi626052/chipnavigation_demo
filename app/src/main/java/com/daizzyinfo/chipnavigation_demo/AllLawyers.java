package com.daizzyinfo.chipnavigation_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.daizzyinfo.chipnavigation_demo.Adapter.AllLawyersAdapter;
import com.daizzyinfo.chipnavigation_demo.Model.AllLawyersResponse;
import com.daizzyinfo.chipnavigation_demo.retrofit.ApiRequest;
import com.daizzyinfo.chipnavigation_demo.retrofit.RetrofitRequest;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AllLawyers extends AppCompatActivity {

    ImageView searchNext;
    List<AllLawyersResponse> allLawyersResponses = new ArrayList<>();
     RecyclerView allawyers_rcy;

     AllLawyersAdapter adapter;

     RelativeLayout filter_first,filter_Free;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_lawyers);

        searchNext=findViewById(R.id.searchNext);
        allawyers_rcy=findViewById(R.id.allawyers_rcy);
        filter_Free=findViewById(R.id.filter_Free);
     //  LawyersDetailsScreen();
        AllLawMeth();
        SearchScreen();

        filter_first=findViewById(R.id.filter_first);


  filter_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AllLawyers.this,Filter.class);
                startActivity(intent);


            }
        });

    }



public void AllLawMeth(){


    ApiRequest request = (ApiRequest) RetrofitRequest.getRetrofit().create(ApiRequest.class);
    Call<AllLawyersResponse> call = request.getAllLawyers("42|Gf15PWHqYTgc3O0LxGd8VlJBVAJsC5pT9SfopO9S");
    call.enqueue(new Callback<AllLawyersResponse>() {
        @Override
        public void onResponse(Call<AllLawyersResponse> call, Response<AllLawyersResponse> response) {

            Log.e("AllLawyers","onResponse "+response.body().getData().get(0).getName());

            AllLawyersResponse response1=response.body();

            if (response.body().getData().size() <= 0){


                Toast.makeText(AllLawyers.this, "Data not found", Toast.LENGTH_SHORT).show();


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

}

/*public void LawyersDetailsScreen(){

    filter_Free.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(AllLawyers.this, AboutLawyer.class);
            startActivity(intent);

        }
    });

}*/

public void SearchScreen(){
    searchNext.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(AllLawyers.this,SearchScreen.class);
            startActivity(intent);
        }
    });

}



}