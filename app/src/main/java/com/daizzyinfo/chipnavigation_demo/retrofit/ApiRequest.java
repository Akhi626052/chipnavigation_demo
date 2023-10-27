package com.daizzyinfo.chipnavigation_demo.retrofit;

import com.daizzyinfo.chipnavigation_demo.CategoriesModel;
import com.daizzyinfo.chipnavigation_demo.Model.AllLawyersResponse;
import com.daizzyinfo.chipnavigation_demo.Model.CorporateLawyersResponse;
import com.daizzyinfo.chipnavigation_demo.Model.CourtsModel;
import com.daizzyinfo.chipnavigation_demo.Model.LawyersDetailsJsonModel;
import com.daizzyinfo.chipnavigation_demo.Model.LawyersDetailsResponse;
import com.daizzyinfo.chipnavigation_demo.Model.LoginWithPassResponse;
import com.daizzyinfo.chipnavigation_demo.Model.MarriageRegistrationModel;
import com.daizzyinfo.chipnavigation_demo.Model.StateDataModel;
import com.daizzyinfo.chipnavigation_demo.Model.couponModel;
import com.daizzyinfo.chipnavigation_demo.Model.notificationResponse;
import com.daizzyinfo.chipnavigation_demo.searchmodel.SearchJsonModel;
import com.daizzyinfo.chipnavigation_demo.searchmodel.SearchResponse;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiRequest {


    @GET("court")
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    Call<CourtsModel> getCourt(@Header("Token") String Token);


    @POST("faq-list?")
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    Call<MarriageRegistrationModel> getMarriage(@Header("Token") String Token);



    @GET("category")
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    Call<CategoriesModel> getCategory(@Header("Token") String Token);


    @GET("all-coupons")
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    Call<couponModel> getCoupons(@Header("Token") String Token);

    @GET(" state-list")
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    Call<StateDataModel> getState(@Header("Token") String Token);

    @GET("all-notifications")
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    Call<notificationResponse> getNoti(@Header("Token") String Token);


    @POST("lawyers-list")
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    Call<AllLawyersResponse> getAllLawyers(@Header("Token") String Token);


    @POST("lawyers-details")
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    Call<LawyersDetailsResponse> getLawDetail(@Header("Token") String Token, @Body LawyersDetailsJsonModel jsonModel);



    @GET("corporate-lawyers")
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    Call<CorporateLawyersResponse> getCorLay(@Header("Token") String Token);

    @POST("search")
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    Call<SearchResponse> getSearch(@Header("Token") String Token, @Body SearchJsonModel jsonModel);

    @POST("login-with-password")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<LoginWithPassResponse> LoginWithPasscodeAPI(@Body JsonObject jsonObject);

}
