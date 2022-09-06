package com.shubham.multithreading.syncronizationstatement;

public class CallMe {

    public void call(String msg){
        try{
            System.out.print("["+msg);
            Thread.sleep(1000);
        }catch(InterruptedException exception){
            exception.printStackTrace();
            Thread.currentThread().interrupt();
        }
        System.out.println("]");
    }
}
