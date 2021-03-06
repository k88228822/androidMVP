package com.example.wang.test.modules.main;

import android.content.Context;

import com.example.wang.test.contract.MainContract;
import com.example.wang.test.entity.TblUser;
import com.example.wang.test.net.RetrofitHelper;
import com.trello.rxlifecycle.android.ActivityEvent;

import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by wangzhen on 2016/12/19.
 */

public class MainModel implements MainContract.Model{
    private MainActivity context;

    public MainModel(Context context){
        this.context =(MainActivity) context;
    }
    public TblUser user;
    @Override
    public Observable<TblUser> getNetInfo() {
        return new RetrofitHelper().getUserInfo("getUserInfo","1")
                .compose(context.bindUntilEvent(ActivityEvent.DESTROY))
                .subscribeOn(Schedulers.io());
//                .subscribe(new Action1<TblUser>() {
//                    @Override
//                    public void call(TblUser object) {
////                        TblUser user=object;
//                        user[0] =object;
//                        System.out.println("用户名是："+ user[0].getName());
//                        System.out.println("登录密码是："+ user[0].getLoginpassword());
//                    }
//                }, new Action1<Throwable>() {
//                    @Override
//                    public void call(Throwable throwable) {
//                        System.out.println("异常");
//                    }
//                });
    }

    public void onSuccess(TblUser user){
        this.user=user;
    }

    public void onError(Throwable throwable){
        System.out.println("异常");
    }

}
