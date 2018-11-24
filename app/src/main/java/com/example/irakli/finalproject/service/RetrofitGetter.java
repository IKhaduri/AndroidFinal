package com.example.irakli.finalproject.service;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitGetter {
    private static final String API_URL = "https://api.fintech.ge/";
    private static Retrofit retrofit;
    private static SessionInterceptor interceptor;

    public static Retrofit getRetrofitInstance() {
        if ( retrofit == null ) {
            interceptor = new SessionInterceptor();

            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(API_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }

    public static void setInterceptorSessionId(String sessionId){
        interceptor.setSessionId(sessionId);
    }
}
