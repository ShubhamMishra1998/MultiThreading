package com.shubham.multithreading.createthreadbyextendingrunnable;

public class NewThread implements Runnable{

    Thread t;
    public NewThread(){
        t=new Thread(this,"NewThread");
        System.out.println(t);
    }


    @Override
    public void run() {
        try {
            for(int i=5;i>0;i--){
                System.out.println("child thread "+i);
                Thread.sleep(500);
            }
        }catch (Exception e){
            e.printStackTrace();
            Thread.currentThread().start();
        }
    }
}
