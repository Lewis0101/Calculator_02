package com.example.lib;

/**
 * 模拟龟兔赛跑
 * 1、创建子线程 继承 Thread + 重写run方法（所有的功能都是在run方法里面实现）
 * 创建子线程对象
 * 调用start方法执行子线程
 */
public class Rabit extends Thread {
    @Override
    public void run() {
        //线程体
        for (int i = 0; i < 1000; i++) {
            System.out.println("兔子跑了" + i + "步");
        }
    }
}

class Tortoise extends Thread {
    @Override
    public void run() {
        //线程体
        for (int i = 0; i < 1000; i++) {
            System.out.println("乌龟跑了" + i + "步");
        }
    }
}
