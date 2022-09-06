package com.shubham.multithreading.syncronizationstatement;

public class Caller implements Runnable{
    Thread t;
    String msg;
    final CallMe target;
    public Caller(CallMe tar,String msg){
        target=tar;
        this.msg=msg;
        t=new Thread(this);
    }
    @Override
    public void run(){
        synchronized (target) {
            target.call(msg);
        }
    }
}
