package com.example.lib;

import java.io.File;

public class Mkdir {
    public static void main(String[] args) {
        String path = "F:/java_code/day1/func";
        File src = new File(path);
        /*System.out.println(src.mkdirs());
        String[] subArrays = src.list();
        for(String sub : subArrays){
            System.out.println(sub);
        }*/

        /*File[] ob = src.listFiles();
        for(File ob1:ob){
            System.out.println(ob1);

        }*/

        String[] namelist = src.list((dir,name)->name.endsWith(".java")
                || new File(name).isDirectory());
        for(String name:namelist){
            System.out.println(name);

        }
    }
}
