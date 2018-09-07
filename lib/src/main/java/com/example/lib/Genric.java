package com.example.lib;

public class Genric {
    public Genric(String str) {
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "true";
    }
    public int exchange(){
        return 1;
    }

    public static void main(String[] args) {
        Genric gen = new Genric("hello");
        System.out.println(gen.toString());
        System.out.println(gen.exchange());
    }
}
