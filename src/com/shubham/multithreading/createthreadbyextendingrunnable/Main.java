package com.shubham.multithreading.createthreadbyextendingrunnable;

public class Main {
    public static void main(String[] args) {
        NewThread newThread=new NewThread();
        newThread.t.start();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
