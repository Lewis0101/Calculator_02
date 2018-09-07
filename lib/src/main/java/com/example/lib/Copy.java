package com.example.lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        String str1 = "F:/poem.txt";
        String str2 = "F:/poem2.txt";
        //调用方法
        copyfile(str1,str2);
    }
    public static void copyfile(String path1,String path2) {
        //建立联系
        File src = new File(path1);
        File src1 = new File(path2);
        //选择字节输入输出流
        FileReader fd = null;
        FileWriter fd1 = null;
        try {
            fd = new FileReader(src);
            fd1 = new FileWriter(src1);

            char[] input = new char[1024];

            int len = 0;
            //循环读取
            while ((len = fd.read(input)) > 0) {

                fd1.write(input, 0, len);

            }
            fd1.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("poem打开文件失败");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("poem1打开文件失败");
        } finally {
            if (null != fd) {
                try {
                    fd.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("poem文件关闭失败");
                }
            }
            if (null != fd1) {
                try {
                    fd1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("poem1文件关闭失败");
                }
            }
        }
    }
}
