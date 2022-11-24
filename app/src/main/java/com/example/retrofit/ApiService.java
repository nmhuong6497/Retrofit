package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("KhoaPhamTraining/json/tien/demo1.json")
    Call<Demo1DTO> getDemo1();

    @GET("KhoaPhamTraining/json/tien/demo2.json")
    Call<Demo2DTO> getDemo2();
}
