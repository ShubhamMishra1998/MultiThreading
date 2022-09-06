package com.shubham.multithreading.stopthread;

public class Main {
    public static void main(String[] args) {
        RunnableStopable runnableStopable=new RunnableStopable();
       Thread thread=new Thread(runnableStopable,"runnable");
       thread.start();
       try{
           Thread.sleep(5000);
       }catch (InterruptedException e){
           e.printStackTrace();
           Thread.currentThread().interrupt();
       }

        System.out.println("stoping runnable stopable");
       runnableStopable.stopThread();



    }
}
