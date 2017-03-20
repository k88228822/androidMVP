package com.example.wang.test.modules.event;

import android.os.Bundle;
import android.widget.TextView;

import com.example.wang.test.R;
import com.example.wang.test.base.RxBaseActivity;
import com.example.wang.test.contract.EventContract;
import com.example.wang.test.entity.event.MessageEvent;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;

public class EventTestActivity extends RxBaseActivity implements EventContract.View{
    @BindView(R.id.eventText) TextView eventText;


    @Override
    public int getLayoutId() {
        return R.layout.activity_event_test;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        eventText.setText("你好");
        EventBus.getDefault().post(new MessageEvent(eventText.getText().toString()));
    }

    @Override
    public void initToolBar() {

    }


}
