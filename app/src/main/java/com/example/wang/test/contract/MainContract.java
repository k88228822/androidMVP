package com.example.wang.test.contract;

import com.example.wang.test.entity.TblUser;

import rx.Observable;

/**
 * Created by wangzhen on 2016/12/19.
 */

public class MainContract {

    public interface Model{
        Observable<TblUser> getNetInfo();
    }

    public interface View{
        void setResultText(String resultText);
    }

    public interface Presenter{
        void init();//初始化
    }
}
