package com.example.lib;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {
    public static void main(String[] args) throws MalformedURLException {
        //参数uname=bjsxt用于界面交互
        //绝对路劲构建
        URL url = new URL("http://www.baidu.com:80/index.html#aa?uname=bjsxt");
        System.out.println("端口"+url.getPort());
        System.out.println("域名"+url.getHost());
        System.out.println("协议"+url.getProtocol());
        System.out.println("锚点"+url.getRef());
        //相对路劲构建
//        url = new URL("http://www.baidu.com:80/a/");
//        url = new URL(url,"b.txt");
//        System.out.println(url.toString());

    }
}
