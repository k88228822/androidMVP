package com.example.wang.test.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.wang.test.R;
import com.example.wang.test.base.RxBaseActivity;
import com.example.wang.test.contract.MainContract;
import com.example.wang.test.presenter.MainPresenter;
import com.jakewharton.rxbinding.view.RxView;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends RxBaseActivity implements MainContract.View{
    private MainPresenter presenter;
    @BindView(R.id.button) Button button;
    @BindView(R.id.text) TextView textView;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        presenter=new MainPresenter(MainActivity.this,this);
        RxView.clicks(button)
                .throttleFirst(1, TimeUnit.SECONDS)
                .subscribe(this::buttonOnClick);

    }

    public void buttonOnClick(Void v){

    }

    @OnClick(R.id.button)
    public void obtainMessage(){
        presenter.init();
    }

    @Override
    public void initToolBar() {

    }

    @Override
    public void setResultText(String resultText) {

    }


}
