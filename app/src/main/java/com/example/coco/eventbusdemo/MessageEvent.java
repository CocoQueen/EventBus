package com.example.coco.eventbusdemo;

/**
 * Created by coco on 2017/8/9.
 */

public class MessageEvent {
    private String mMsg;

    public String getmMsg() {
        return mMsg;
    }

    public void setmMsg(String mMsg) {
        this.mMsg = mMsg;
    }



    public MessageEvent(String msg) {
        this.mMsg = msg;
    }


}
