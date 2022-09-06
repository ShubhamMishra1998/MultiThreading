package com.shubham.multithreading.racecondition;

public class MyData implements Runnable{

    private  int data=0;

    @Override
    public void run() {
//        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " " + getData());
            setData(data + 1);
//        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
