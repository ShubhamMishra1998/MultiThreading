package com.shubham.multithreading.waystocreatethread;

public class Method3 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("thread is running");
            }
        };
       Thread thread=new Thread(runnable);
       thread.start();
    }
}
