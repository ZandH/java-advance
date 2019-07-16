package com.hp.week1;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.util.Random;

/**
 * 随机两点之间的距离练习
 *
 * @author 屏儿
 * 2019/07/11
 */
public class Point {
    public static void main(String[] args) throws Exception{
        Random random = new Random();
        //生成redRandom随机值
        int redRandom = random.nextInt(256);
        //生成greenRandom的随机值
        int greenRandom = random.nextInt(256);
        //生成blueRandom随机值
        int blueRandom = random.nextInt(256);
        BufferedImage bufferedImage = new BufferedImage(1024,768,BufferedImage.TYPE_INT_RGB);
        //获取随机点
        int x1 = random.nextInt(1024);
        int y1 = random.nextInt(768);
        int x2 = random.nextInt(1024);
        int y2 = random.nextInt(768);

        double distance = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        System.out.println("两点坐标为：("+x1+","+y1+"),"+"("+x2+","+y2+")");

        System.out.printf("两点距离为："+"%.2f",Math.sqrt(distance));
        //画笔
        Graphics graphics = bufferedImage.getGraphics();

        //设置画笔颜色，使用随机生成的颜色
        Color color = new Color(redRandom,greenRandom,blueRandom);
        graphics.setColor(color);
        graphics.fillRect(0,0,1024,768);
        graphics.setColor(Color.black);
        graphics.drawLine(x1,y1,x2,y2);
        NumberFormat numberFormat = NumberFormat.getInstance();
        String m = numberFormat.format(distance);
        //长度
        graphics.drawString(m,(x1+x2)/2,(y1+y2)/2);
        //指定文件路径
        File file = new File("D:/point.jpg");
        //获取字节输出流
        OutputStream outputStream = new FileOutputStream(file);
        ImageIO.write(bufferedImage,"jpg",outputStream);
        outputStream.close();


    }
}
