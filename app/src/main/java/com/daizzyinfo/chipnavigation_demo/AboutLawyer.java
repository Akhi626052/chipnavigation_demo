package com.daizzyinfo.chipnavigation_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.daizzyinfo.chipnavigation_demo.Adapter.DayAdapter;
import com.daizzyinfo.chipnavigation_demo.Adapter.TimeslotAdapter;
import com.daizzyinfo.chipnavigation_demo.Model.DayModel;
import com.daizzyinfo.chipnavigation_demo.Model.LawyersDetailsJsonModel;
import com.daizzyinfo.chipnavigation_demo.Model.LawyersDetailsModel;
import com.daizzyinfo.chipnavigation_demo.Model.LawyersDetailsResponse;
import com.daizzyinfo.chipnavigation_demo.Model.TimeslotModel;
import com.daizzyinfo.chipnavigation_demo.retrofit.ApiRequest;
import com.daizzyinfo.chipnavigation_demo.retrofit.RetrofitRequest;
import com.daizzyinfo.chipnavigation_demo.searchmodel.LawyerModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AboutLawyer extends AppCompatActivity {
String ls_uid;
String user_type;
TextView txt_about_lawyer1,txt_designation_name,txt_name,txt_address,txt_department_name,txt_languages,txt_practice_areas,tx_name;
RecyclerView timeSlot_rcv,availableDay_rcv;
List<LawyersDetailsResponse> lawyersDetailsResponses = new ArrayList<LawyersDetailsResponse>();
List<DayModel> dayModels = new ArrayList<DayModel>();
List<TimeslotModel> timeslotModels = new ArrayList<TimeslotModel>();
List<LawyersDetailsModel> lawyersDetailsModels = new ArrayList<LawyersDetailsModel>();


    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_lawyer);


   //   AvailableDay(ls_uid,user_type);

        txt_about_lawyer1=findViewById(R.id.txt_about_lawyer1);
        txt_designation_name=findViewById(R.id.txt_designation_name);
        txt_name=findViewById(R.id.txt_name);
        txt_address=findViewById(R.id.txt_address);
        txt_department_name=findViewById(R.id.txt_department_name);
        txt_languages=findViewById(R.id.txt_languages);
        txt_practice_areas=findViewById(R.id.txt_practice_areas);
        tx_name=findViewById(R.id.tx_name);



        timeSlot_rcv=findViewById(R.id.timeSlot_rcv);
        availableDay_rcv=findViewById(R.id.availableDay_rcv);

        LawyersDetal(ls_uid,user_type);

    }

    public void LawyersDetal(String ls_uid, String user_type) {
        Intent intent = getIntent();

        String Id = intent.getStringExtra("LsUid");
        String Usertype = intent.getStringExtra("Usertype");
        Log.e("AboutLawyer", "staff detail intent  id - " + Id);
        Log.e("AboutLawyer", "staff detail intent  Usertype - " + Usertype);

        /*
         String Ids = intent.getStringExtra("LsUid");
         String Usertypes = intent.getStringExtra("Usertypes");
         Log.e("AboutLawyer", "Lawyer detail intent  id - " + Ids);
          Log.e("AboutLawyer", "Lawyer detail intent  Usertype - " + Usertypes);*/
        LawyersDetailsJsonModel jsonModel = new LawyersDetailsJsonModel(Id, Usertype);
        ApiRequest request = RetrofitRequest.getRetrofit().create(ApiRequest.class);
        Call<LawyersDetailsResponse> call = request.getLawDetail("42|Gf15PWHqYTgc3O0LxGd8VlJBVAJsC5pT9SfopO9S", jsonModel);
        call.enqueue(new Callback<LawyersDetailsResponse>() {
            @Override
            public void onResponse(Call<LawyersDetailsResponse> call, Response<LawyersDetailsResponse> response) {


                LawyersDetailsResponse response1 = response.body();
              lawyersDetailsResponses.add(response1);

                txt_name.setText(response.body().getData().get(0).getName());



                if(response.body().getData().get(0).getStaffId() == null){


                          txt_about_lawyer1.setText(response.body().getData().get(0).getAboutLawyer());
                          txt_designation_name.setText(response.body().getData().get(0).getDesignation());
                          txt_address.setText(response.body().getData().get(0).getAddress());
                          txt_department_name.setText(response.body().getData().get(0).getDepartment());
                          txt_languages.setText(response.body().getData().get(0).getLanguages());
                          txt_practice_areas.setText(response.body().getData().get(0).getPracticeAreas());
                          Log.e("AboutLawyers", "staffData"+response.body().getData().get(0).getName());


                }
                else{

                    txt_about_lawyer1.setText(response.body().getData().get(0).getAboutStaff());
                    txt_designation_name.setText(response.body().getData().get(0).getDesignation());
                    txt_address.setText(response.body().getData().get(0).getAddress());
                    txt_department_name.setText(response.body().getData().get(0).getDepartment());
                    txt_languages.setText(response.body().getData().get(0).getLanguages());
                    txt_practice_areas.setText(response.body().getData().get(0).getPracticeAreas());
                    Log.e("AboutLawyers", "LawyersData"+response.body().getData().get(0).getName());


                }

                Log.e("AboutLawyer","AvailableDay Day----"+response.body().getData().toString());



              for (int i=0; i< response.body().getData().size(); i++) {

                  dayModels.add(response.body().getData().get(i).getDays().get(0));

                  LinearLayoutManager linearLayoutManager=new LinearLayoutManager(AboutLawyer.this,RecyclerView.VERTICAL,false);
                  availableDay_rcv.setLayoutManager(linearLayoutManager);

                  DayAdapter adapter = new DayAdapter(dayModels,AboutLawyer.this);
                  availableDay_rcv.setAdapter(adapter);

                  Log.e("AboutLawyer","hello world"+response.body().getData().get(i).getDays().toString());

             }
             for (int i=0; i < response.body().getData().size(); i++) {


                 timeslotModels.add(response.body().getData().get(i).getTimeslot().get(i));




                 LinearLayoutManager linearLayoutManager=new LinearLayoutManager(AboutLawyer.this,RecyclerView.VERTICAL,false);
                 timeSlot_rcv.setLayoutManager(linearLayoutManager);

                 TimeslotAdapter adapter = new TimeslotAdapter(timeslotModels,AboutLawyer.this);
                 timeSlot_rcv.setAdapter(adapter);


             }

            }

            @Override
            public void onFailure(Call<LawyersDetailsResponse> call, Throwable t) {

                Log.e("AboutLawyer---------onFailure--------------","onFailure"+t.getMessage());

            }
           });
    }








/*    public void AvailableDay(String ls_uid, String user_type){

     Intent intent = new Intent();

    String ID = intent.getStringExtra("LsUid");
    String UserType = intent.getStringExtra("user_type");

    Log.e("AboutLawyer","----lawyers----"+ ID);
    Log.e("AboutLawyer","-----staff----"+ UserType);

    LawyersDetailsJsonModel jsonModel = new LawyersDetailsJsonModel(ID, UserType);
       ApiRequest request = RetrofitRequest.getRetrofit().create(ApiRequest.class);
       Call<LawyersDetailsResponse> call = request.getLawDetail(" ",jsonModel);

       call.enqueue(new Callback<LawyersDetailsResponse>() {
    @Override
    public void onResponse(Call<LawyersDetailsResponse> call, Response<LawyersDetailsResponse> response) {

        LawyersDetailsResponse response1 = response.body();
        lawyersDetailsResponses.add(response1);

        Log.e("AboutLawyer","AvailableDay onResponse"+response.body().getData());

        Toast.makeText(AboutLawyer.this, "AvailableDay onResponse", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onFailure(Call<LawyersDetailsResponse> call, Throwable t) {

        Toast.makeText(AboutLawyer.this, "AvailableDay onFailed", Toast.LENGTH_SHORT).show();

        Log.e("AboutLawyer","onFailure"+t.getMessage());


    }
});

    }

    public void TimeSlotMt(String ls_uid, String user_type){

        Intent intent = new Intent();

        String ID = intent.getStringExtra("LsUid");
        String UserType = intent.getStringExtra("user_type");

        Log.e("AboutLawyer","----lawyers----"+ ID);
        Log.e("AboutLawyer","-----staff----"+ UserType);

        LawyersDetailsJsonModel jsonModel = new LawyersDetailsJsonModel(ID, UserType);
        ApiRequest request = RetrofitRequest.getRetrofit().create(ApiRequest.class);
        Call<LawyersDetailsResponse> call = request.getLawDetail(" ",jsonModel);
        call.enqueue(new Callback<LawyersDetailsResponse>() {

            @Override
            public void onResponse(Call<LawyersDetailsResponse> call, Response<LawyersDetailsResponse> response) {

                LawyersDetailsResponse response1 = response.body();
                lawyersDetailsResponses.add(response1);

                Log.e("AboutLawyer","TimeSlot onResponse"+response.body().getData().get(0).toString());
                Toast.makeText(AboutLawyer.this, "AvailableDay onResponse", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<LawyersDetailsResponse> call, Throwable t) {

                Toast.makeText(AboutLawyer.this, "TimeSlot onFailed", Toast.LENGTH_SHORT).show();
                Log.e("AboutLawyer","onFailure"+t.getMessage());


            }
        });
    }*/




    }

