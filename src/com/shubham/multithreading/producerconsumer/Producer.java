package com.shubham.multithreading.producerconsumer;

public class Producer implements Runnable{

    MyQueue<Integer> q;
    Thread t;

    public Producer(MyQueue<Integer> q){
        this.q=q;
        t=new Thread(this,"producer");
    }


    @Override
    public void run() {
        for(int i=0;i<10;i++){
            q.put(i);
        }
    }
}
