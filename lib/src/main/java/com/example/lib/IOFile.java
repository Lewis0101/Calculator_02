package com.example.lib;

import java.io.File;
import java.io.IOException;

public class IOFile {
    public static void main(String[] args) {
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);

        //访问文件名的方法
        File src = new File("E:\\谷歌下载\\1.jpg");
        System.out.println(src.getAbsoluteFile());
        System.out.println(src.getName());
        System.out.println(src.getPath());
        System.out.println(src.getAbsolutePath());
        System.out.println(src.getParent());
        System.out.println(src.getFreeSpace());

        //文件判断的方法
        System.out.println("isexit:"+src.exists());
        System.out.println("iswrite:"+src.canWrite());

        try {
            test();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    //创建新文件
    public static void test() throws IOException {
        String path = "E:/2.jpg";
        File src = new File(path);
        if(!src.exists()){
            boolean flag = src.createNewFile();
            System.out.println(flag?"success":"fail");
        }

    }
}
