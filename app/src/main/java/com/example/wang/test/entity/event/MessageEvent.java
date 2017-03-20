package com.example.wang.test.entity.event;

/**
 * Created by wangzhen on 2017/3/20.
 */

public class MessageEvent {
    private int id;
    private String msg;

    public MessageEvent(String msg) {
        this.msg = msg;
    }

    public MessageEvent(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
