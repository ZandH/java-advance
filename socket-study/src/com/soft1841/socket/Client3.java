package com.soft1841.socket;

import java.io.IOException;
import java.net.Socket;

/**
 * 客户端
 */
public class Client3 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("112.23.230",10086);
        System.out.println(socket.getRemoteSocketAddress());
    }
}
