package com.example.irakli.finalproject.login;

import android.util.Log;

import com.example.irakli.finalproject.service.FintechAPI;
import com.example.irakli.finalproject.service.LoginData;
import com.example.irakli.finalproject.service.RetrofitGetter;
import com.example.irakli.finalproject.service.UserDetails;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class LoginModel implements LoginContract.LoginInteractor {
    private Retrofit retrofit;
    private FintechAPI api;
    public LoginModel(){
        retrofit = RetrofitGetter.getRetrofitInstance();
        api = retrofit.create(FintechAPI.class);
    }


    @Override
    public void getData(final LoginContract.LoginPresenter presenter, String username, String password) {

        Call<LoginData> loginData = api.login(username, password);
        loginData.enqueue(new Callback<LoginData>() {
            @Override
            public void onResponse(Call<LoginData> call, Response<LoginData> response) {
                LoginData data = response.body();
                Log.e("login data", data.getSessionId());
                RetrofitGetter.setInterceptorSessionId(data.getSessionId());
                presenter.setLoginData(data.getUserDetails());

            }

            @Override
            public void onFailure(Call<LoginData> call, Throwable t) {
                presenter.setLoginError("Network Error");
            }
        });


    }
}
