package com.helloworld.springboot;

import java.util.concurrent.TimeUnit;

public class TestReturn {

    public static String printNumber(){
        String name = Thread.currentThread().getName();
        System.out.println("threadName="+name);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return printNumber();
    }

    public static void main(String[] args) {
        new Thread(()->{printNumber();},"A").start();
    }
}
