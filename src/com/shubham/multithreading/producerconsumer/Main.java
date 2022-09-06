package com.shubham.multithreading.producerconsumer;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> q=new MyQueue<>(5);
        Producer producer=new Producer(q);
        Consumer consumer=new Consumer(q);
        producer.t.start();
        consumer.t.start();
    }
}
