package com.shubham.multithreading.waystocreatethread;

public class Method2 {
    public static class Thread2 implements Runnable{

        @Override
        public void run(){
            System.out.println("Thread 2 is running");
        }
    }
    public static void main(String[] args) {
        Thread t1=new Thread(new Thread2());
        t1.start();

    }
}
