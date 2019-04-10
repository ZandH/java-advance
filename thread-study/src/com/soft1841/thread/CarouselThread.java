package com.soft1841.thread;
import javax.swing.*;
import java.io.*;

public class CarouselThread implements Runnable {
    //准备图片路径数据
    private String [] imgs = {"D:/carousel/1.JPG","D:/carousel/2.JPG","D:/carousel/3.JPG","D:/carousel/4.JPG","D:/carousel/5.JPG"};
    //定义一个图片标签
    private JLabel bgLabel;
    public void  setBgLabel(JLabel bgLabel){
        this.bgLabel = bgLabel;
    }
    @Override
    public void run() {
        int i =0;
        int len = imgs.length -1;
        while (true){
            //通过路径构建File对象
            try {
                File file = new File(imgs[i]);
                InputStream inputStream = new FileInputStream(file);
                byte[] bytes = new byte[(int) file.length()];
                inputStream.read(bytes);
                Icon icon = new ImageIcon(bytes);
                bgLabel.setIcon(icon);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                if (i == len){
                    i = 0;
                }
            } catch (IOException e) {
                System.out.println("IO异常");
            }
        }

    }
}