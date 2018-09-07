package com.example.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件读取
 * 1、建立联系 File对象
 * 2、选择流  文件输入流 InputStream FileIputStream
 * 3、操作  : byte[] car = new byte[1024]+read+读取大小
 *           输出
 * 4、释放资源 :关闭
 * */
public class IO {
    public static void main(String[] args) {
        //建立联系 File 对象
        File src = new File("F:/test.txt");
        //选择流
        InputStream is = null ;//提升作用域

        {
            try {
                is = new FileInputStream(src);
                //读取/缓冲数组
                byte[] car = new byte[1024];
                int len = 0; //接受实际读取大小
                while (-1 !=(len = is.read(car))){
                    //输出。将字节数转字符串
                    String info = new String(car,0,len);
                    System.out.println(info);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("文件不存在");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("读取文件失败");
            }finally {
                //释放资源
                if (null != is){
                    try {
                        is.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("关闭文件输入流");
                    }
                }
            }
        }

    }


}
