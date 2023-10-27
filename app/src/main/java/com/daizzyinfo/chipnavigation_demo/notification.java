package com.daizzyinfo.chipnavigation_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.daizzyinfo.chipnavigation_demo.Adapter.NotificationAdapter;
import com.daizzyinfo.chipnavigation_demo.Model.notificationModel;
import com.daizzyinfo.chipnavigation_demo.Model.notificationResponse;
import com.daizzyinfo.chipnavigation_demo.retrofit.ApiRequest;
import com.daizzyinfo.chipnavigation_demo.retrofit.RetrofitRequest;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class notification extends AppCompatActivity {
    SwipeRefreshLayout swipeToRefresh;
    RecyclerView recyclerView;
    int number = 0;
 List<notificationResponse> notifResonse =new ArrayList<notificationResponse>();
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        recyclerView=findViewById(R.id.recyclerView);

        swipeToRefresh=findViewById(R.id.swipeToRefresh);
        notificationMt();








    }
    public void notificationMt(){

        List<notificationResponse> notifResonse=new ArrayList<notificationResponse>();
        ApiRequest request= RetrofitRequest.getRetrofit().create(ApiRequest.class);
        Call<notificationResponse> call = request.getNoti("28|G8yvRAZ4Q3X5Wm9VQsjwIS6KCDCW7WBC8t3S4x0S");
        call.enqueue(new Callback<notificationResponse>() {
            @Override
           public void onResponse(Call<notificationResponse> call, Response<notificationResponse> response) {

                Log.e("notification","onResponse-------------------------"+response.body().getData().get(0).getTitleName());
                notificationResponse response1 = response.body();

        if (response.body().getData().size() <= 0) {

            Toast.makeText(notification.this, "Data not found", Toast.LENGTH_SHORT).show();
            Log.e("notification","onResponse"+response.body().getData().get(0).getTitleName());

          }
        else {

            notifResonse.add(response1);
           for (int i = 0; i < response.body().getData().size(); i++) {

           Log.e("notification","onResponse"+response.body().getData().get(i).getTitleName());
           Log.e("notification","onResponse"+notifResonse.get(0).getData().get(i).getTitleName());

           }


       RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(notification.this,LinearLayoutManager.VERTICAL,false);
       recyclerView.setLayoutManager(layoutManager);
       NotificationAdapter adapter = new NotificationAdapter(notifResonse,notification.this);
       recyclerView.setAdapter(adapter);
       adapter.notifyDataSetChanged();


            swipeToRefresh. setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener(){
                @SuppressLint("NotifyDataSetChanged")
                @Override
                public void onRefresh(){
                    //number++;
                    recyclerView.setVisibility(View.VISIBLE);
                    //count. setText(String.value0f(number));
                    swipeToRefresh.setRefreshing(false);
                    adapter.notifyDataSetChanged();
                    Toast.makeText(notification.this, "referesh", Toast.LENGTH_SHORT).show();
                }
            });



// swipeRefreshLayout use in
     /*       swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                @Override
                public void onRefresh() {
                    swipeRefreshLayout.setRefreshing(false);
                    RearrangeItems();
                }
            });*/




}
      }

           @Override
           public void onFailure(Call<notificationResponse> call, Throwable t) {

           Log.e("notification","onFailure--------------------------"+t.getMessage().toString());

           }
       });
    }

/*    public void shuffle(){
        Collections.shuffle(arrayList, new Random(System.currentTimeMillis()));
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        mListView.setAdapter(adapter);
    }*/


}
/* court*/
    /*ApiRequest request = RetrofitRequest.getRetrofit().create(ApiRequest.class);
    Call<CourtsModel> call = request.getCourt("10|UuVnhP9CD6bLnRty47elLE55WoimQjtbntLcKcGl");
        call.enqueue(new Callback<CourtsModel>() {
@Override
public void onResponse(Call<CourtsModel> call, Response<CourtsModel> response) {

        Log.e("MainActivity", "onResponse" + response.body().getData().get(0).toString());
        CourtsModel response1 = response.body();
        if (response.body().getData().size() <= 0) {

        Toast.makeText(getContext(), "Data not found", Toast.LENGTH_SHORT).show();

        } else {
        for (int i = 0; i < response.body().getData().size(); i++) {

        courtsModels.add(response1);
        Log.e("HomeFragment", "success " + response.body().getData().get(i).getCourtName());
        Log.e("HomeFragment", "success " + courtsModels.get(0).getData().get(i).getCourtName());

        }

        RecyclerView.LayoutManager layoutManager4 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        CourtsAdapter adapter4 = new CourtsAdapter(courtsModels, getContext());
        courts_rey.setLayoutManager(layoutManager4);
        courts_rey.setAdapter(adapter4);
        adapter4.notifyDataSetChanged();
        }
        }

@Override
public void onFailure(Call<CourtsModel> call, Throwable t) {

        });

        }
*/