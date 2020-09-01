package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostEndPoint {

    @GET("getdata.php")
    Call<List<ModelClass>> getNews();
}
