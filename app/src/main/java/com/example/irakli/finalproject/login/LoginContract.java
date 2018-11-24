package com.example.irakli.finalproject.login;

import com.example.irakli.finalproject.service.UserDetails;

public interface LoginContract {

    interface LoginView{
        void showLoginErrorMessage(String errorMessage);
    }

    interface LoginPresenter{
        void login(String username, String password);
        void setLoginData(UserDetails userDetails);
        void setLoginError(String error);
    }

    interface LoginInteractor{
        void getData(LoginPresenter presenter, String username, String password);
    }


}
