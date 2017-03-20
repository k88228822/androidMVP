package com.example.wang.test.modules.main;

import android.content.Context;

import com.example.wang.test.contract.MainContract;

/**
 * Created by wangzhen on 2016/12/19.
 */

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View view;
    private MainContract.Model model;

    public MainPresenter(Context context, MainContract.View view) {
        this.view=view;
        model=new MainModel(context);
    }

    @Override
    public void init() {
        model.getNetInfo();
    }

}
