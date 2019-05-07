package com.soft1841.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 多线程的服务端
 */
public class Server3 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        System.out.println("服务器启动成功");
        while (true) {
            Socket socket = ss.accept();
            ServerThread3 serverThread3 = new ServerThread3(socket);

            new Thread(serverThread3).start();
        }
    }
}

class ServerThread3 implements Runnable {
    private Socket socket;

    public ServerThread3(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println(socket.getInetAddress() + "客户端连接成功");

        try {

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
