package com.example.wang.test.modules.main;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wang.test.R;
import com.example.wang.test.base.RxBaseActivity;
import com.example.wang.test.contract.MainContract;
import com.example.wang.test.entity.event.MessageEvent;
import com.example.wang.test.modules.event.EventTestActivity;
import com.jakewharton.rxbinding.view.RxView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

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
        EventBus.getDefault().register(this);
        presenter=new MainPresenter(MainActivity.this,this);
        RxView.clicks(button)
                .throttleFirst(1, TimeUnit.SECONDS)
                .subscribe(this::buttonOnClick);

    }

    public void buttonOnClick(Void v){

    }

    @OnClick(R.id.button)
    public void obtainMessage(){
//        presenter.init();
        Intent intent=new Intent(getApplicationContext(), EventTestActivity.class);
        startActivity(intent);
    }

    @Override
    public void initToolBar() {

    }

    @Override
    public void setResultText(String resultText) {

    }

    @Subscribe(threadMode= ThreadMode.MAIN)
    public void onMessage(MessageEvent msg){
        Toast.makeText(this, "接收到的消息:"+msg.getMsg(), Toast.LENGTH_SHORT).show();
    }

}
