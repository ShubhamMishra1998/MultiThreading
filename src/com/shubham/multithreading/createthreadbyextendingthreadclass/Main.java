package com.shubham.multithreading.createthreadbyextendingthreadclass;

public class Main {
    public static void main(String[] args) {
        NewThread newThread=new NewThread();
        newThread.start();

        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
