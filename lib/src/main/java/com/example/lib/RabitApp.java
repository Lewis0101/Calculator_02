package com.example.lib;

public class RabitApp {
    public static void main(String[] args) {
        //创建子对象
        Rabit  rab = new Rabit();
        Tortoise tor = new Tortoise();

        //调用start方法
        rab.start();
        tor.start();

        for(int i = 0;i<1000;i++){
            System.out.println("main==>"+i);
        }
    }
}
