package com.example.lib;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 客户端
 * 1、创建客户端+端口
 * 2、准备数据
 * 3、打包(指定发送地点及端口)
 * 4、发送
 * 5、释放
 * @author  LiuYang
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //1、创建客户端+端口
        DatagramSocket client = new DatagramSocket(6666);
        //2、准备数据
        String msg = "udp Program";
        byte[] data = msg.getBytes();
        //3、打包(指定发送地点及端口)
        DatagramPacket packet = new DatagramPacket(data, data.length,new InetSocketAddress("127.0.0.1",8888));
        //4、发送
        client.send(packet);
        //5、释放
        client.close();

    }

}
