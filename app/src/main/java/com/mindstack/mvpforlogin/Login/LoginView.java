package com.mindstack.mvpforlogin.Login;

/**
 * Created by vimesh on 15/08/17.
 */

public interface LoginView {
    String getUserName();
    void showUsernameError(int resId);
    String getPassword();
    void showPasswordError(int resId);
    void startMainActivity();
    void showLoginError(int resId);

}
