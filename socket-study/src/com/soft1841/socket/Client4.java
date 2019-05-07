package com.soft1841.socket;


import java.io.*;
import java.net.Socket;

public class Client4{
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("10.40.206.82",10091);
        System.out.println("成功连接服务器");
        File file = new File("D:/1.jpg");
        byte[] b = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        is.read(b);
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
        bos.write(b);
        is.close();
        bos.close();

    }
}
