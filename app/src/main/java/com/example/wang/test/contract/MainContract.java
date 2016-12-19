package com.example.wang.test.contract;

/**
 * Created by wangzhen on 2016/12/19.
 */

public class MainContract {

    public interface Model{
        public void getNetInfo();
    }

    public interface View{
        public void setResultText(String resultText);
    }

    public interface Presenter{
        public void init();//初始化
    }
}
