package com.mindstack.mvpforlogin.Login;

/**
 * Created by vimesh on 15/08/17.
 */

public class LoginService {
    public boolean login(String userName,String password){
        return "android".equalsIgnoreCase(userName) && "mvp".equalsIgnoreCase(password);
    }
}

