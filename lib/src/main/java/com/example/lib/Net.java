package com.example.lib;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net {
    public static void main(String[] args) {
        //使用getLocalHost 方法创建InetAddress对象
        InetAddress addr;

        {
            try {
                addr = InetAddress.getLocalHost();
                System.out.println(addr.getHostAddress()+"\t"+addr.getHostName());
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
        try {
            addr = InetAddress.getByName("www.163.com");
            System.out.println(addr.getHostAddress()+"\t"+addr.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        try {
            addr = InetAddress.getByName("112.240.60.204");
            System.out.println(addr.getHostAddress()+"\t"+addr.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
