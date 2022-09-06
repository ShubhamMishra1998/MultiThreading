package com.shubham.multithreading.stopthread;

public class RunnableStopable implements Runnable{
    private boolean isStop=false;

    public synchronized void stopThread(){
        this.isStop=true;
    }

    public synchronized boolean isStopped(){
        return this.isStop;
    }

    private void sleep(long millis){
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void run() {
        System.out.println("RunnableStoppable is running");
        while (!isStopped()){
            sleep(1000);
            System.out.println("...");
        }
        System.out.println("RunnableStoppable is stopped");
    }
}
