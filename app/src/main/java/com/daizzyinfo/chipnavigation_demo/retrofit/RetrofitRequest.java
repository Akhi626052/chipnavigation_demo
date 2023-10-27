package com.daizzyinfo.chipnavigation_demo.retrofit;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;


public class RetrofitRequest {


    public static Retrofit retrofit = null;

    public static Retrofit getRetrofit() {


        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request newRequest  = chain.request().newBuilder()
                       
                        
                        //  SharedPreferences Sh = getSharedPreferences("MySharedPreferences",MODE_PRIVATE);
                        //   String s1 = Sh.getString("Token", "").toString();

                        .addHeader("Authorization", "Bearer " + "158|pI9sURZYCbzICubIOxJgvfezQuz9WxhiNyo9rpAn")
                        .build();
                return chain.proceed(newRequest);

            }
        }).build();



        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .client(client)
                    .baseUrl("http://odeguard.com/demo/lawyer/public/api/customer/")
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;


      }







    }


