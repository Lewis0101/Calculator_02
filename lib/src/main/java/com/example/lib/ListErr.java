package com.example.lib;

import java.util.ArrayList;
import java.util.List;

public class ListErr {
    public static void main(String[] args) {
        //创建一个只想保存字符串的List集合
        List <String > strList = new ArrayList<>(); //强制限定strList装的是String类型的数据
        strList.add("Dog");
        strList.add("Catmua");
        //“不小心”把一个interface对象丢进了集合

        strList.forEach(str -> System.out.println(str.length()));
    }
}
