package com.shubham.multithreading.createthreadbyextendingthreadclass;

public class NewThread extends Thread{

    public NewThread(){
        super("new thread");
        System.out.println(this);
    }

    @Override
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("New Thread "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException exception){
            exception.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
