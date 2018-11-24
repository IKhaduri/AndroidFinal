package com.example.irakli.finalproject.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.irakli.finalproject.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.LoginView {
    private EditText etUsername;
    private EditText etPassword;
    private Button buttonLogin;
    private LoginContract.LoginPresenter presenter;
    private Validator validator;
    private final String USERNAME_DISPLAY = "username";
    private final String PASSWORD_DISPLAY = "password";
    private final int MIN_CHARACTER_COUNT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        return;
        /*
        setContentView(R.layout.activity_login);

        buttonLogin = findViewById(R.id.buttonLogin);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        presenter = new LoginPresenter(this);
        validator = new Validator();

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginButtonClicked();
            }
        });
*/
    }

    private void loginButtonClicked() {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        validator.validateLength(username, USERNAME_DISPLAY,MIN_CHARACTER_COUNT);
        validator.validateLength(password, PASSWORD_DISPLAY, MIN_CHARACTER_COUNT);
        String errorMessage = validator.getErrorMessage();
        if (errorMessage.length()==0){
            //successful validation
            presenter.login(username, password);

        }
        else {
            showLoginErrorMessage(errorMessage);

        }
        validator.clear();
    }



    @Override
    public void showLoginErrorMessage(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }
}
