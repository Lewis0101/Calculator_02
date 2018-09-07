package com.example.lib;

public abstract class SleepDemo implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        for(int i = 10;i>=0;i--) {
            if (i == 5) break;
            System.out.println(i);
            Thread.sleep(1000);
        }

    }
}
