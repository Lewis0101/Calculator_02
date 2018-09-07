package com.example.lib;

import java.util.concurrent.Executors;

public class ThreadApp implements Runnable{
    private int num = 50;
    private boolean flag = true;
    @Override
    //线程体
    public void run() {
        //调用线程不安全方法
        /*try {
            test1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //调用线程安全方法1
        //test2();
        //调用线程安全方法2
        test3();
    }

    public static void main(String[] args) {
        //创建真实对象
        ThreadApp ne = new ThreadApp();
        //创建代理对象并引用
        Thread t1 = new Thread(ne,"person");
        //匿名代理
        new Thread(ne,"police").start();
        Thread t2 = new Thread(ne,"student");
        Thread t3 = new Thread(ne,"teacher");

        //启动多线程
        t1.start();
        t2.start();
        t3.start();

    }
    //线程不安全
    public void test1() throws InterruptedException {
        while (true) {
            if (num <= 0) {
                flag = false;//跳出循环
                return;
            }
            System.out.println(Thread.currentThread().getName() + "get it " + num--);
            Thread.sleep(100);
        }
    }
    //线程安全做法1 Use synchronized -->同步方法
    public synchronized void test2(){
        while (true) {
            if (num <= 0) {
                flag = false;//跳出循环
                return;
            }
            System.out.println(Thread.currentThread().getName() + "get it " + num--);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //线程安全做法2-->同步块
    public void test3(){
        synchronized (this){
            while (true) {
                if (num <= 0) {
                    flag = false;//跳出循环
                    return;
                }
                System.out.println(Thread.currentThread().getName() + "get it " + num--);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
