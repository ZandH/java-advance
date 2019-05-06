package com.soft1841.thread;

import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        //创建客户端对象，指定连接的IP和端口
        Socket socket = new Socket("192.168.43.29", 10086);
        System.out.println("已和服务器建立连接，远程主机地址：" + socket.getRemoteSocketAddress());
    }
}

