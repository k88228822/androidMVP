package com.example.wang.test.contract;

import com.example.wang.test.entity.TblUser;

/**
 * Created by wangzhen on 2016/12/19.
 */

public class MainContract {

    public interface Model{
        public TblUser getNetInfo();
    }

    public interface View{
        public void setResultText(String resultText);
    }

    public interface Presenter{
        public void init();//初始化
    }
}
