package com.daizzyinfo.chipnavigation_demo.Fragment;

import static android.content.Context.MODE_PRIVATE;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.daizzyinfo.chipnavigation_demo.Adapter.LawyersbycourtAdapter;
import com.daizzyinfo.chipnavigation_demo.Adapter.MarriageRegistrationAdapter;
import com.daizzyinfo.chipnavigation_demo.Adapter.couponAdapter;
import com.daizzyinfo.chipnavigation_demo.AllCategories;
import com.daizzyinfo.chipnavigation_demo.CategoriesAdapter;
import com.daizzyinfo.chipnavigation_demo.CategoriesModel;
import com.daizzyinfo.chipnavigation_demo.Adapter.CorporateLawyersAdapter;
import com.daizzyinfo.chipnavigation_demo.Model.CorporateLawyersModel;
import com.daizzyinfo.chipnavigation_demo.Adapter.CourtsAdapter;
import com.daizzyinfo.chipnavigation_demo.Model.CorporateLawyersResponse;
import com.daizzyinfo.chipnavigation_demo.Model.CourtsModel;
import com.daizzyinfo.chipnavigation_demo.Model.MarriageRegistrationModel;
import com.daizzyinfo.chipnavigation_demo.Model.LawyersbycourtModel;
import com.daizzyinfo.chipnavigation_demo.Model.couponModel;
import com.daizzyinfo.chipnavigation_demo.R;
import com.daizzyinfo.chipnavigation_demo.TodayAppointmentAdapter;
import com.daizzyinfo.chipnavigation_demo.TodayAppointmentModel;
import com.daizzyinfo.chipnavigation_demo.TopLawyersAdapter;
import com.daizzyinfo.chipnavigation_demo.TopLawyersModel;
import com.daizzyinfo.chipnavigation_demo.retrofit.ApiRequest;
import com.daizzyinfo.chipnavigation_demo.retrofit.RetrofitRequest;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {

    TextView ct_vi_all_id;
    ImageSlider land_and_FirmIg;
    RecyclerView recyclerView, today_apm_rey_id, Top_lawyer_rey, marriage_rey, courts_rey, corporate_lawyers_rey, lawyers_by_courts_rey, coupon_rcy;

    List<couponModel> couponModels = new ArrayList<couponModel>();
    List<CategoriesModel> categories = new ArrayList<>();

    List<TodayAppointmentModel> todayAppointmentModels = new ArrayList<>();
    List<MarriageRegistrationModel> marriageRegistrationModel = new ArrayList<>();
    List<TopLawyersModel> topLawyerModels = new ArrayList<>();
    List<CourtsModel> courtsModels = new ArrayList<>();
    List<CorporateLawyersResponse> corporateLawyersResponses = new ArrayList<>();
    List<LawyersbycourtModel> lawyersByCourtsModels = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

// stop this method immediately.
       // CorporateLawyers();

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);


        /*Today Appointment recycler view */
        today_apm_rey_id = view.findViewById(R.id.today_apm_rey_id);
        todayAppointmentModels.add(new TodayAppointmentModel("Suksham Aggarwal", "27/03/2023 | 12:50 PM"));
        todayAppointmentModels.add(new TodayAppointmentModel("Suksham Aggarwal", "27/04/2023 | 12:70 PM"));
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        TodayAppointmentAdapter adapter1 = new TodayAppointmentAdapter(todayAppointmentModels, getContext());
        today_apm_rey_id.setLayoutManager(layoutManager1);
        today_apm_rey_id.setAdapter(adapter1);

        /*TopLawyers*/
        Top_lawyer_rey = view.findViewById(R.id.Top_lawyer_rey);
        topLawyerModels.add(new TopLawyersModel(R.drawable.fimal_ig, "Rajesh K.S", "Arbitration, Cheque Boun...", "16 years Experience", "Kailash Hills, Delh", "199", "4.5(12 Reviews)"));
        topLawyerModels.add(new TopLawyersModel(R.drawable.fimal_ig, "Rajesh K.S", "Arbitration, Cheque Boun...", "16 years Experience", "Kailash Hills, Delh", "199", "4.5(12 Reviews)"));
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        TopLawyersAdapter adapter2 = new TopLawyersAdapter(topLawyerModels, getContext());
        Top_lawyer_rey.setLayoutManager(layoutManager2);
        Top_lawyer_rey.setAdapter(adapter2);






        /*        Corporate Lawyers*/


        corporate_lawyers_rey = view.findViewById(R.id.corporate_lawyers_rey);



        /*   Lawyers by court*/

        lawyers_by_courts_rey = view.findViewById(R.id.lawyers_by_courts_rey);
        lawyersByCourtsModels.add(new LawyersbycourtModel("High Court Advocate"));
        lawyersByCourtsModels.add(new LawyersbycourtModel("High Court Advocate"));
        lawyersByCourtsModels.add(new LawyersbycourtModel("High Court Advocate"));
        RecyclerView.LayoutManager layoutManager6 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        LawyersbycourtAdapter adapter6 = new LawyersbycourtAdapter(lawyersByCourtsModels, getContext());
        lawyers_by_courts_rey.setLayoutManager(layoutManager6);
        lawyers_by_courts_rey.setAdapter(adapter6);
        ct_vi_all_id = view.findViewById(R.id.ct_vi_all_id);

        land_and_FirmIg = view.findViewById(R.id.land_and_FirmIg);

        courts_rey = view.findViewById(R.id.courts_rey);
        marriage_rey = view.findViewById(R.id.marriage_rey);
        coupon_rcy = view.findViewById(R.id.coupon_rcy);


        ImageSlider();
        viewAllMt();
        CourtMt();
        CouponMt();
        //  FaqList();
        Categories();
        //CouponMt();
        return view;

    }


    public void ImageSlider() {

        ArrayList<SlideModel> slidermoides = new ArrayList<SlideModel>();
        slidermoides.add(new SlideModel(R.drawable.rectangle, ScaleTypes.FIT));
        slidermoides.add(new SlideModel(R.drawable.rectangle, ScaleTypes.FIT));
        slidermoides.add(new SlideModel(R.drawable.rectangle, ScaleTypes.FIT));
        slidermoides.add(new SlideModel(R.drawable.rectangle, ScaleTypes.FIT));
        slidermoides.add(new SlideModel(R.drawable.rectangle, ScaleTypes.FIT));
        land_and_FirmIg.setImageList(slidermoides);


    }

    public void viewAllMt() {
        ct_vi_all_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AllCategories.class);
                startActivity(intent);
            }
        });


    }

    public void CourtMt() {

        /* court*/
        ApiRequest request = RetrofitRequest.getRetrofit().create(ApiRequest.class);
        Call<CourtsModel> call = request.getCourt("42|Gf15PWHqYTgc3O0LxGd8VlJBVAJsC5pT9SfopO9S");
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


            }
        });
    }

    public void FaqList() {
        /*  marriage registration*/

        ApiRequest requests = RetrofitRequest.getRetrofit().create(ApiRequest.class);
        Call<MarriageRegistrationModel> call = requests.getMarriage("42|Gf15PWHqYTgc3O0LxGd8VlJBVAJsC5pT9SfopO9S");
        call.enqueue(new Callback<MarriageRegistrationModel>() {


            @Override
            public void onResponse(Call<MarriageRegistrationModel> call, Response<MarriageRegistrationModel> response) {
                MarriageRegistrationModel model = response.body();

                if (response.body().getData().size() <= 0) {

                    Toast.makeText(getContext(), "Data not found", Toast.LENGTH_SHORT).show();

                } else {

                    for (int i = 0; i < response.body().getData().size(); i++) {
                        marriageRegistrationModel.add(model);
                        Log.e("HomeFragment", "onResponse: " + response.body().getData().get(i).getTitleName());
                        Log.e("HomeFragment", "onResponse: " + marriageRegistrationModel.get(0).getData().get(0).getDescription());

                    }
                    RecyclerView.LayoutManager layoutManager3 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
                    MarriageRegistrationAdapter adapter3 = new MarriageRegistrationAdapter(marriageRegistrationModel, getContext());
                    marriage_rey.setLayoutManager(layoutManager3);
                    marriage_rey.setAdapter(adapter3);
                    adapter3.notifyDataSetChanged();
                    Log.e("HomeFragment", "onResponse" + response.body().getData().get(0).toString());

                }

            }

            @Override
            public void onFailure(Call<MarriageRegistrationModel> call, Throwable t) {
                Log.e("HomeFragment", "onFailure" + t.getMessage().toString());

            }
        });
    }


    public void Categories() {

        /*categories recycler view */

        ApiRequest requests = RetrofitRequest.getRetrofit().create(ApiRequest.class);
        SharedPreferences SH = getActivity().getSharedPreferences("MySharedPreferences", Context.MODE_PRIVATE);
        String s1 = SH.getString("Token", "").toString();
        Call<CategoriesModel> call = requests.getCategory(s1);


        // Call<CategoriesModel> call = requests.getCategory("257|dObh45X5GwN6onXEJBXMNlJHHbZY4CVpcGn3HwKS");
        call.enqueue(new Callback<CategoriesModel>() {


            @Override
            public void onResponse(Call<CategoriesModel> call, Response<CategoriesModel> response) {
                CategoriesModel model = response.body();

                if (response.body().getData().size() <= 0) {

                    Toast.makeText(getContext(), "Data not found", Toast.LENGTH_SHORT).show();

                } else {

                    for (int i = 0; i < response.body().getData().size(); i++) {

                        categories.add(model);
                        Log.e("HomeFragment", "onResponse: " + response.body().getData().get(i).getName());
                        //  Log.e("HomeFragment", "onResponse: " + categories.get(0).getData().get(0).getImage());

                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
                    CategoriesAdapter adapter = new CategoriesAdapter(categories, getContext());
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                    Log.e("HomeFragment", "onResponse" + response.body().getData().get(0).toString());
                }
            }

            public void onFailure(Call<CategoriesModel> call, Throwable t) {

                Log.e("HomeFragment", "onFailure" + t.getMessage().toString());

            }
        });
    }
    //error ke karan band kar diya gaya he

    public void CouponMt() {

        ApiRequest requests = RetrofitRequest.getRetrofit().create(ApiRequest.class);
        Call<couponModel> call = requests.getCoupons("42|Gf15PWHqYTgc3O0LxGd8VlJBVAJsC5pT9SfopO9S");
        call.enqueue(new Callback<couponModel>() {


            @Override
            public void onResponse(Call<couponModel> call, Response<couponModel> response) {
                couponModel model = response.body();

                if (response.body().getData().size() <= 0) {

                    Toast.makeText(getContext(), "Data not found", Toast.LENGTH_SHORT).show();

                } else {

                    for (int i = 0; i < response.body().getData().size(); i++) {
                        couponModels.add(model);
                        Log.e("HomeFragment", "onResponse: " + response.body().getData().get(i).getCouponCode());
                        Log.e("HomeFragment", "onResponse: " + response.body().getData().get(i).getTitle());
                        Log.e("HomeFragment", "onResponse: " + response.body().getData().get(i).getUserType());

                        //  Log.e("HomeFragment", "onResponse: " + categories.get(0).getData().get(0).getImage());

                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

                    couponAdapter adapter = new couponAdapter(couponModels, getContext());
                    coupon_rcy.setLayoutManager(layoutManager);
                    coupon_rcy.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                    Log.e("HomeFragment", "onResponse" + response.body().getData().get(0).toString());
                }
            }

            public void onFailure(Call<couponModel> call, Throwable t) {
                Log.e("HomeFragment", "onFailure" + t.getMessage().toString());

            }
        });


    }


    public void CorporateLawyers() {
        List<CorporateLawyersResponse> corporateLawyersResponses = new ArrayList<>();

        ApiRequest requests = RetrofitRequest.getRetrofit().create(ApiRequest.class);
        Call<CorporateLawyersResponse> call = requests.getCorLay("158|pI9sURZYCbzICubIOxJgvfezQuz9WxhiNyo9rpAn");
        //Call<CorporateLawyersResponse> call = requests.getCorLay("28|G8yvRAZ4Q3X5Wm9VQsjwIS6KCDCW7WBC8t3S4x0S");
        call.enqueue(new Callback<CorporateLawyersResponse>() {


            @Override
            public void onResponse(Call<CorporateLawyersResponse> call, Response<CorporateLawyersResponse> response) {
                CorporateLawyersResponse model = response.body();
                Log.e("I shouldn't be here","onResponse should");
                if (model.getData().size() == 0) {

                    Toast.makeText(getContext(), "Data not found", Toast.LENGTH_SHORT).show();

                } else {

                    for (int i = 0; i < response.body().getData().size(); i++) {
                        corporateLawyersResponses.add(model);
                        Log.e("HomeFragment", "onResponse: " + response.body().getData().get(i).getName());


                        //  Log.e("HomeFragment", "onResponse: " + categories.get(0).getData().get(0).getImage());

                    }
                    RecyclerView.LayoutManager layoutManager5 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
                    CorporateLawyersAdapter adapter5 = new CorporateLawyersAdapter(corporateLawyersResponses, getContext());
                    corporate_lawyers_rey.setLayoutManager(layoutManager5);
                    corporate_lawyers_rey.setAdapter(adapter5);
                    Log.e("HomeFragment", "onResponse" + response.body().getData().get(0).toString());
                }
            }

            public void onFailure(Call<CorporateLawyersResponse> call, Throwable t) {


                Log.e("HomeFragment", "onFailure" + t.getMessage().toString());


            }
        });


    }


}

