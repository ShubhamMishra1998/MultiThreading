package com.shubham.multithreading.syncronizationstatement;

public class Sync {
    public static void main(String[] args) {
        CallMe target=new CallMe();
        Caller c1=new Caller(target,"Hello");
        Caller c2=new Caller(target,"Synchronized");
        Caller c3=new Caller(target,"World");
        c1.t.start();
        c2.t.start();
        c3.t.start();
        try{
            c1.t.join();
            c2.t.join();
            c3.t.join();
        }catch (InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

    }
}
