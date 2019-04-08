package com.soft1841.thread;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 读取网络图片
 * @author 屏儿
 * 2019/04/09
 */

public class GetImageByNet {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://img1.doubanio.com/view/group/sqxs/public/17fdb616ff143d8.webp");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(5 * 1000);
        InputStream inStream = conn.getInputStream();
        ByteArrayOutputStream out1 = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1){
            out1.write(buffer,0,len);
        }
        inStream.close();
        byte[] date = out1.toByteArray();
        File imageFile = new File("1.jpg");
        OutputStream out2 = new FileOutputStream(imageFile);

        out2.write(date);
        out2.close();

    }
}

