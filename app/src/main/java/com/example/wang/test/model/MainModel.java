package com.example.wang.test.model;

import android.content.Context;

import com.example.wang.test.base.RxBaseActivity;
import com.example.wang.test.contract.MainContract;
import com.example.wang.test.entity.TblUser;
import com.example.wang.test.net.RetrofitHelper;
import com.trello.rxlifecycle.ActivityEvent;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by wangzhen on 2016/12/19.
 */

public class MainModel implements MainContract.Model{
    private RxBaseActivity context;

    public MainModel(Context context) {
        this.context =(RxBaseActivity) context;
    }

    @Override
    public void getNetInfo() {
        new RetrofitHelper().getUserInfo("getUserInfo","1")
                .compose(context.bindUntilEvent(ActivityEvent.DESTROY))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object object) {
                        TblUser user=(TblUser)object;
                        System.out.println("用户名是："+user.getName());
                        System.out.println("登录密码是："+user.getLoginpassword());

                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {

                    }
                });
    }

}
