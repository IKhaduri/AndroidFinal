package com.example.irakli.finalproject.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FintechAPI {
    @GET("api/Clients/Login/{username}/{password}")
    Call<LoginData> login(@Path("username") String username,@Path("password") String password);

    @GET("api/Products/AssetsAndLiabilities")
    Call<AssetsAndLiabilities> getAssetsAndLiabilities();

}
