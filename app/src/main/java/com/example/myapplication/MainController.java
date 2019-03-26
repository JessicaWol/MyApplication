package com.example.myapplication;


import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import retrofit2.Callback;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainController {

    private MainActivity activity;

    public MainController(MainActivity mainActivity) {
        this.activity = mainActivity;
    }

    public void onStart(){

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/JessicaWol/fichJson/master/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        RestProductsApi restApi = retrofit.create(RestProductsApi.class);

        Call<RestProductsResponse> call = restApi.getProduits();
        call.enqueue(new Callback<RestProductsResponse>() {
            @Override
            public void onResponse(Call<RestProductsResponse> call, Response<RestProductsResponse> response) {
                RestProductsResponse restResponse = response.body();
                List<products> list = restResponse.getProduits();
                activity.showList(list);
            }

            @Override
            public void onFailure(Call<RestProductsResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }
}





