package com.shubham.multithreading.producerconsumer;

public class Consumer implements Runnable{

    MyQueue<Integer> q;
    Thread t;
    public Consumer(MyQueue<Integer> q){
        this.q=q;
        t=new Thread(this,"Consumer");
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            q.get();
        }
    }
}
