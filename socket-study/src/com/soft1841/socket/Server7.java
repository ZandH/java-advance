package com.soft1841.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server7 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务器启动..");
        while (true) {
            Socket socket = serverSocket.accept();
            ServerThread7 server = new ServerThread7(socket);
            new Thread(server).start();
        }

    }
}
