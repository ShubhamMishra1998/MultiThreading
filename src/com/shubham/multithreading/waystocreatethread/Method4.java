package com.shubham.multithreading.waystocreatethread;

public class Method4 {
    public static void main(String[] args) {
        Runnable runnable=()->{
            System.out.println("Thread is running");
        };

        Thread t1=new Thread(runnable);
        t1.start();
    }
}
