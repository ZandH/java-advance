package com.soft1841.socket;


import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client5{
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.40.170.126",10091);
        //hq
        InputStream in = socket.getInputStream();
        byte[] b = new byte[1024];
        in.read(b);
        System.out.println("服务端发送的数据是："+new String(b));
        in.close();
        socket.close();

    }
}
