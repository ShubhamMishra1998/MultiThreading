package com.shubham.multithreading.synchronizationmethod;

public class CallMe {

    public synchronized void call(String s1) {
        try {
            System.out.print("["+s1);
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        System.out.println("]");
    }
}
