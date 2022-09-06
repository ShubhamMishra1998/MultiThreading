package com.shubham.multithreading.racecondition;

public class Main {
    public static void main(String[] args) {
        MyData myData=new MyData();
        Thread t1=new Thread(myData,"Thread1");
        Thread t2=new Thread(myData,"Thread2");
        t1.start();
        t2.start();

    }
}
