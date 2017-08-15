package com.mindstack.mvpforlogin.Login;

import com.mindstack.mvpforlogin.R;

/**
 * Created by vimesh on 15/08/17.
 */

public class LoginPresenter {
    private LoginView view;
    private LoginService service;
    public LoginPresenter(LoginView view,LoginService service){
        this.view=view;
        this.service=service;
    }
    public void onLoginClicked(){
        String userName=view.getUserName();
        if(userName.isEmpty()){
            view.showUsernameError(R.string.username_error);
            return;
        }
        String password = view.getPassword();
        if (password.isEmpty()) {
            view.showPasswordError(R.string.password_error);
            return;
        }
        boolean loginSucceeded=service.login(userName,password);
            if(loginSucceeded){
                view.startMainActivity();
                return;
            }
        view.showLoginError(R.string.login_failed);
    }
}
