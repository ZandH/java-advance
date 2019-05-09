package com.soft1841.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        /**
         *
         */
        //
        InetAddress address = InetAddress.getByName("localhost");
        int port = 8888;
        byte[] date = "用户名：admin,密码：123".getBytes();
        //
        DatagramPacket packet = new DatagramPacket(date,date.length,address,port);
        //
        DatagramSocket socket = new DatagramSocket();
        //
        socket.send(packet);
        /**
         *
         */
        //
        byte[] date2 = new byte[1024];
        DatagramPacket packet2 = new DatagramPacket(date2,date2.length);
        //
        socket.receive(packet2);
        //
        String reply = new String(date2,0,packet2.getLength());
        System.out.println("我是客户端，服务器说："+reply);
        //4.关闭资源
        socket.close();

    }
}
