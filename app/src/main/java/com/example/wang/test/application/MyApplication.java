package com.example.wang.test.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by wangzhen on 2016/12/20.
 */

public class MyApplication extends Application {
    public static Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext=this;
    }

    public static Context getContext()
    {
        return mAppContext;
    }
}
