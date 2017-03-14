package com.example.wang.test.presenter;

import android.content.Context;

import com.example.wang.test.contract.MainContract;
import com.example.wang.test.model.MainModel;

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
