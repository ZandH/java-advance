package com.soft1841.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.Buffer;

class  ServerThread1 implements Runnable{
    private Socket socket;
    public ServerThread1(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        System.out.println("客户端"+socket.getInetAddress()+"连续成功！");
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println(br.readLine());
            br.close();
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
