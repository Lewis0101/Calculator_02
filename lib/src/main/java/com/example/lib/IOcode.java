package com.example.lib;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class IOcode {
    public static void main(String[] args) {

        {
            try {
                //指定解码字符集
                BufferedReader br = new BufferedReader(new InputStreamReader
                        (new BufferedInputStream(new FileInputStream
                                (new File("F:/poem.txt"))),"UTF-8"));

                //写出文件 编码
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter
                        (new BufferedOutputStream(new FileOutputStream
                                (new File("F:/poem3.txt")))));
                String info = null;
                while (null != (info = br.readLine())){
                    bw.write(info);
                    bw.newLine();
                }
                bw.flush();
                br.close();
                bw.close();
            } catch (java.io.IOException e) {
                e.printStackTrace();
                System.out.println("解码异常");
            }
        }
    }

}
