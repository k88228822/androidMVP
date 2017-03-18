package com.example.wang.test.contract;

import com.example.wang.test.entity.TblUser;

import rx.Observable;

/**
 * Created by wangzhen on 2016/12/19.
 */

public class MainContract {

    public interface Model{
        public Observable<TblUser> getNetInfo();
    }

    public interface View{
        public void setResultText(String resultText);
    }

    public interface Presenter{
        public void init();//初始化
    }
}
