package com.daizzyinfo.chipnavigation_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.daizzyinfo.chipnavigation_demo.Adapter.SearchAdapter;
import com.daizzyinfo.chipnavigation_demo.Adapter.SearchLawyersAdapter;
import com.daizzyinfo.chipnavigation_demo.retrofit.ApiRequest;
import com.daizzyinfo.chipnavigation_demo.retrofit.RetrofitRequest;
import com.daizzyinfo.chipnavigation_demo.searchmodel.CategoryModel;
import com.daizzyinfo.chipnavigation_demo.searchmodel.LawyerModel;
import com.daizzyinfo.chipnavigation_demo.searchmodel.SearchJsonModel;
import com.daizzyinfo.chipnavigation_demo.searchmodel.SearchResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchScreen extends AppCompatActivity {

    EditText edTxt_searchBtn;
    RecyclerView searchRcy,topLawyersRcy;
    String search = "a";
    ImageView searchBtn;

List<SearchResponse> searchResponses = new ArrayList<SearchResponse>();
List<CategoryModel> categoryMod = new ArrayList<CategoryModel>();
List<LawyerModel> lawyerModels = new ArrayList<LawyerModel>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_screen);
        searchBtn=findViewById(R.id.searchBtn);
        searchRcy=findViewById(R.id.searchRcy);
        topLawyersRcy=findViewById(R.id.topLawyersRcy);
        edTxt_searchBtn=findViewById(R.id.edTxt_searchBtn);

      //  SearchSc(search);

        edTxt_searchBtn.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                /*String edTxt_searchBtn = s.toString();
                Log.d("TextChanged", "Current Text: " + edTxt_searchBtn);*/
                clearModel();

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                search = edTxt_searchBtn.getText().toString();
                SearchSc(search);


            }

            @Override
            public void afterTextChanged(Editable s) {

                clearModel();

            }
        });



    }
    public void SearchSc(String search) {


        Log.e("SearchScreen", "SearchSc---------------" + search);
        SearchJsonModel searchJsonModel = new SearchJsonModel(search);
        ApiRequest request = (ApiRequest) RetrofitRequest.getRetrofit().create(ApiRequest.class);
        Call<SearchResponse> call = request.getSearch("42|Gf15PWHqYTgc3O0LxGd8VlJBVAJsC5pT9SfopO9S", searchJsonModel);
        call.enqueue(new Callback<SearchResponse>() {

            @Override
            public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {


                if(response.body().getData().getCategory().size() <= 0) {

                    Toast.makeText(SearchScreen.this, "Data not found", Toast.LENGTH_SHORT).show();


                }

                 else {


                    for(int i = 0; i < response.body().getData().getCategory().size(); i++) {
                        Log.e("SearchScreen:","length of category data-----------------------" + response.body().getData().getCategory().size());
                        CategoryModel model = response.body().getData().getCategory().get(i);
                        categoryMod.add(model);
                        GridLayoutManager layoutManager = new GridLayoutManager(SearchScreen.this, 2,RecyclerView.VERTICAL,false);
                        SearchAdapter adapter = new SearchAdapter(categoryMod,SearchScreen.this);
                        searchRcy.setLayoutManager(layoutManager);
                       searchRcy.setAdapter(adapter);
                       adapter.notifyDataSetChanged();
                        /*   String responseData = response.body().getData().getCategory().toString();
                        SearchSc(responseData);*/

                    }


                    for (int j = 0; j < response.body().getData().getLawyer().size(); j++){
                        Log.e("SearchScreen:","length of category data--------------------------" + response.body().getData().getLawyer().size());
                         LawyerModel model1 = response.body().getData().getLawyer().get(j);
                        lawyerModels.add(model1);
                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(SearchScreen.this, LinearLayoutManager.VERTICAL, false);
                        topLawyersRcy.setLayoutManager(linearLayoutManager);
                        SearchLawyersAdapter adapter1 = new SearchLawyersAdapter(lawyerModels,SearchScreen.this);
                      topLawyersRcy.setAdapter(adapter1);
                       adapter1.notifyDataSetChanged();

                    }

                 }


              }


            @Override
            public void onFailure(Call<SearchResponse> call, Throwable t) {

                Log.e("SearchScreen", "onFailure---------------" + t.getMessage().toString());

            }
        });


    }
    private void clearModel() {
        // Clear the data in your model or perform other actions
        // For example, if you have a list-based model, you can clear the list:

        categoryMod.clear();
        lawyerModels.clear();


        // You can also update UI elements or perform other necessary actions
        // For example, if you have a TextView to display the cleared status:

    }

}