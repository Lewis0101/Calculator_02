package com.example.lib;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class InandOut {
    public static void main(String[] args) throws FileNotFoundException {
        //创建输出流
        PrintStream fs = new PrintStream(new FileOutputStream("F:/poem.txt"));

    }
}
