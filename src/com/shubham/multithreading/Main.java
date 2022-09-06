package com.shubham.multithreading;

 public class Main {
    public static void main(String[] args){
        Thread t=Thread.currentThread();
        System.out.println(t);
        t.setName("My thread");
        System.out.println(t);
        try {
            for(int i=5;i>0;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
