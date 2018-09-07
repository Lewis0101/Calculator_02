package com.example.lib;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/**
 * 获取资源：源代码
 * @author LiuYang
 */

public class URLDemo01 {
    //网络爬虫
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://ww.baidu.com");//主页（默认资源）

//        InputStream is = url.openStream();
//
//        byte[] flush = new byte[1024];
//        int len = 0;
//        while((len = is.read(flush))>0){
//            //System.out.println(new String(flush,0,len));
//            bw.write(flush,0,len);
//
//        }
        //缓冲流增强吸性能
        BufferedReader br =
                new BufferedReader(new InputStreamReader(url.openStream(),"utf-8")  );
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:/baidu.html"),"utf-8"));

        String msg = null;
        //readLine 以一行一行的读取
        while((msg = br.readLine()) != null){
            bw.append(msg); //以一列一列写入
            bw.newLine();//换行
        }
        bw.flush();//强制刷出
        bw.close();
        br.close();



    }

}
