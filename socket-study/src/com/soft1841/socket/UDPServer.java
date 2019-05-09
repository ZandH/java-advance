package com.soft1841.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 服务器端
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {
        /**
         * 接收客户端消息
         */
        //1.创建服务端DatagramSocket，指定端口
        DatagramSocket socket = new DatagramSocket(8888);
        //2.
        byte[] date = new byte[1024];
        DatagramPacket packet = new DatagramPacket(date,date.length);
        //3.
        System.out.println("****服务器已经启动，等待客户端发送数据");
        socket.receive(packet);
        //4.
        String info = new String(date,0,packet.getLength());
        System.out.println("我是服务器，客户端说："+info);
        /**
         * 向客户端响应数据
         */
        //1.
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        byte[] date2 = "欢迎您！".getBytes();
        //2.
        DatagramPacket packet2 = new DatagramPacket(date2,date2.length,address,port);
        //
        socket.send(packet2);
        socket.close();

    }
}
