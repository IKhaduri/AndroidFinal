package com.example.irakli.finalproject.login;

import android.util.Log;

import com.example.irakli.finalproject.service.UserDetails;

public class LoginPresenter implements LoginContract.LoginPresenter {
    private static  final  String INCORRECT_LOGIN = "Incorrect login and password";
    private LoginContract.LoginView loginView;
    private LoginContract.LoginInteractor loginInteractor;

    public LoginPresenter(LoginContract.LoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginModel();

    }

    @Override
    public void login(String username, String password) {
        loginInteractor.getData(this, username, password);
    }

    @Override
    public void setLoginData(UserDetails userDetails) {
        //mock check of data being correct
        //in real application an error would be checked
        // but this api is a mess.
        if (!userDetails.isActive()){
            loginView.showLoginErrorMessage(INCORRECT_LOGIN);
        }
        else{
            //correct login
            Log.e("Successful login",userDetails.getPhoneForSms());
        }

    }

    @Override
    public void setLoginError(String error) {
        loginView.showLoginErrorMessage(error);
    }
}
