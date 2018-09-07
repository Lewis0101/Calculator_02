package com.example.lib;

public class SingleExample {

    public static void main(String[] args) {
//懒汉式的验证
//        Jvm jvm1 = Jvm.getinstance();
//        Jvm jvm2 = Jvm.getinstance();
//        System.out.println(jvm1);
//        System.out.println(jvm2);

//        线程验证
//        JvmThread thread1 = new JvmThread(100);
//        JvmThread thread2 = new JvmThread(200);
//        thread1.start();
//        thread2.start();

//        饿汉式的验证
//        Jvm1 jvm1 = Jvm1.getInstance();
//        Jvm1 jvm2 = Jvm1.getInstance();
//        System.out.println(jvm1);
//        System.out.println(jvm2);
    }

}

class JvmThread extends Thread{
    private long time;
    public JvmThread(long time){
        this.time = time;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"-->创建"+Jvm.getinstance(time));
    }
}
/**
 * 单例设计模式
 * 确保一个类只有一个对象
 * 懒汉式(double checking)
 * 1、构造器私有化，避免外部直接创建对象
 * 2、声明一个私有的静态变量
 * 3、创建一个对外公共的静态方法访问该变量，如果变量没有对象,创建该对象
 */
class Jvm{
    //声明一个私有的静态变量
    private static Jvm instance = null;
    //构造器私有化，避免外部直接创建对象
    private Jvm(){}

    //创建一个对外公共的静态方法访问该变量，如果变量没有对象,创建该对象
    public static Jvm getinstance(long time){
        if(null == instance){
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Jvm();
        }
        return instance;

    }

}

/**
 * 饿汉式
 * 1、构造器私有化
 * 2、声明一个私有的静态属性，同时创建该对象
 * 3、对外提供访问属性的静态方法
*/
class Jvm1{
    //声明一个私有的静态属性，同时创建该对象
    private static Jvm1 instance = new Jvm1();
    //构造器私有化
    private Jvm1(){}
    //对外提供访问属性的静态方法
    public static Jvm1 getInstance(){
        return instance;
    }

}