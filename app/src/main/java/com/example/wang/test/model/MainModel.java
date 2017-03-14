package com.example.wang.test.model;

import android.content.Context;

import com.example.wang.test.contract.MainContract;
import com.example.wang.test.entity.TblUser;
import com.example.wang.test.net.RetrofitHelper;
import com.example.wang.test.ui.MainActivity;
import com.trello.rxlifecycle.ActivityEvent;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by wangzhen on 2016/12/19.
 */

public class MainModel implements MainContract.Model{
    private MainActivity context;

    public MainModel(Context context){
        this.context =(MainActivity) context;
    }

    @Override
    public TblUser getNetInfo() {
        final TblUser[] user = {null};

        new RetrofitHelper().getUserInfo("getUserInfo","1")
                .compose(context.<TblUser>bindUntilEvent(ActivityEvent.DESTROY))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<TblUser>() {
                    @Override
                    public void call(TblUser object) {
//                        TblUser user=object;
                        user[0] =object;
                        System.out.println("用户名是："+ user[0].getName());
                        System.out.println("登录密码是："+ user[0].getLoginpassword());
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        System.out.println("异常");
                    }
                });
        return user[0];
    }

}
