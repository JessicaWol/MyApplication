package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestProductsApi {
    @GET("makeup1")
    Call<List<Products>> getProduits();
}
