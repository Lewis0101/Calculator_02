package com.example.lib;

public class Apple<T> {
    //使用T类型形参定义实例变量
    private T info;
    public Apple(){}
    //下面方法中使用T类型形参来定义构造器
    public Apple(T info){
        this.info = info;
    }
    public void setInfo(T info){
        this.info = info;
    }
    public T getInfo(){
        return this.info;
    }

    public static void main(String[] args) {
        Apple<String> a1 = new Apple<>("苹果");
        System.out.println(a1.getInfo());
        Apple<Double> a2 = new Apple<>(5.67);
        System.out.println(a2.getInfo());
        Apple<Integer> a3 =  new Apple<>(1020);
        System.out.println(a3.getInfo());
    }
}
