package com.mindstack.mvpforlogin;

import android.content.Context;
import android.content.Intent;

import com.mindstack.mvpforlogin.Main.MainActivity;

/**
 * Created by vimesh on 15/08/17.
 */

public class ActivityUtil {
    private Context context;
    public ActivityUtil(Context context){
        this.context=context;
    }
    public void startMainActivity(){
        context.startActivity(new Intent(context, MainActivity.class));
    }
}
