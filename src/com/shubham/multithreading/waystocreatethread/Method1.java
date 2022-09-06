package com.shubham.multithreading.waystocreatethread;


public class Method1 {
    public static class Thread1 extends Thread{
        @Override
        public void run(){
            System.out.println("thread 1 running");
        }
    }
    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        thread1.start();
    }
}
