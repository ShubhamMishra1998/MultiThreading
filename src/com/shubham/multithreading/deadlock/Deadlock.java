package com.shubham.multithreading.deadlock;

public class Deadlock {
    public static Object L1=new Object();
    public static Object L2=new Object();

    private static class Thread1 extends Thread{

        @Override
        public void run(){
            synchronized (L1){
                System.out.println("Thread1 holding lock 1");
                try{
                    Thread.sleep(400);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread1 waiting for Lock2...");
                synchronized (L2){
                    System.out.println("Thread2 holding lock1 and lock2");
                }
            }
        }
    }

    private static class Thread2 extends Thread{

        @Override
        public void run(){
            synchronized (L2){
                System.out.println("Thread2 holding lock 2");

                System.out.println("Thread2 waiting for Lock1...");
                synchronized (L1){
                    System.out.println("Thread1 holding lock2 and lock1");
                }
            }
        }
    }






    public static void main(String[] args) {
       Thread1 t1=new Thread1();
       Thread2 t2=new Thread2();
       t1.start();
       t2.start();
    }
}

