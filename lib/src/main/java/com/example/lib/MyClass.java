package com.example.lib;

import java.util.HashMap;

public class MyClass {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        System.out.println("zzz");
        HashMap hs = new HashMap();
        hs.put("Crazy world",10);
        hs.put("Crazy Man",15);
        hs.put("Crazy Day",20);
        System.out.println(hs);

    }
}
