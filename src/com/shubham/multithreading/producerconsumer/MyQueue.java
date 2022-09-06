package com.shubham.multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {
    Queue<T> q;
    int maxSize;
    public MyQueue(int size){
        this.maxSize=size;
        q=new LinkedList<>();
    }

    public synchronized void put(T t){
        while (q.size()==maxSize){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Element "+t+"added to queue");
        q.add(t);
        notifyAll();
    }

    public synchronized T get(){
        while(q.isEmpty()){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        T t=q.remove();
        System.out.println("Element removed from the queue "+t);
        notifyAll();
        return t;
    }
}
