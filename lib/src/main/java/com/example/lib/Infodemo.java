package com.example.lib;

public class Infodemo {
    public static void main(String[] args) {
        SleepDemo it = new SleepDemo() {
            @Override
            public void run() {

            }
        };
        Thread proxy = new Thread(it,"aiti");

    }
}
