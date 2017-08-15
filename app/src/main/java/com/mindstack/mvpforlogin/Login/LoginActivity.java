package com.mindstack.mvpforlogin.Login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mindstack.mvpforlogin.ActivityUtil;
import com.mindstack.mvpforlogin.R;

public class LoginActivity extends AppCompatActivity implements LoginView {
    private EditText usernameView;
    private EditText passwordView;
    LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usernameView = (EditText) findViewById(R.id.username);
        passwordView = (EditText) findViewById(R.id.password);
        loginPresenter=new LoginPresenter(this,new LoginService());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public void onLoginClicked(View view) {
        loginPresenter.onLoginClicked();
    }
    @Override
    public String getUserName() {
        return usernameView.getText().toString();
    }

    @Override
    public void showUsernameError(int resId) {
       usernameView.setError(getString(resId));
    }

    @Override
    public String getPassword() {
        return passwordView.getText().toString();
    }

    @Override
    public void showPasswordError(int resId) {
        passwordView.setError(getString(resId));
    }

    @Override
    public void startMainActivity() {
        new ActivityUtil(this).startMainActivity();
    }

    @Override
    public void showLoginError(int resId) {
        Toast.makeText(this,getString(resId),Toast.LENGTH_LONG).show();
    }
}
