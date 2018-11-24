package com.example.irakli.finalproject.service;

import android.util.Log;

import java.io.IOException;

import okhttp3.Request;
import okhttp3.Response;

public class SessionInterceptor implements okhttp3.Interceptor {
    private String sessionId = null;
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request curRequest = chain.request();
        Log.e("Request", curRequest.url().toString());
        Response response;
        if (sessionId != null){
             Request finalRequest = curRequest.newBuilder().url(curRequest.url() + "/" + sessionId).build();
             response = chain.proceed(finalRequest);
             Log.e("with session", finalRequest.url().toString());
        }else {
            response = chain.proceed(curRequest);
        }
        return response;
    }

    public void setSessionId(String sessionId){
        this.sessionId = sessionId;
    }
}
