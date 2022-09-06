package com.shubham.multithreading.synchronizationmethod;

public class Caller implements Runnable{

    CallMe target;
    Thread t;
    String msg;
    public Caller(CallMe tar,String msg){
        target = tar;
        this.msg=msg;
        t=new Thread(this);
    }

    @Override
    public void run() {
        target.call(msg);
    }
}
