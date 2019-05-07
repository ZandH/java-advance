package com.soft1841.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server6 {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务器启动");
        while (true) {
            Socket socket = serverSocket.accept();
            ServerThread6 server = new ServerThread6(socket);
            new Thread(server).start();
        }

    }
}

