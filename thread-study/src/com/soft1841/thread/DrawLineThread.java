package com.soft1841.thread;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawLineThread implements Runnable {
    int x = 200;
    int y= 100;
    private JFrame frame;
    //定义颜色数组
    private  Color[] colors = {Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,Color.orange,
            Color.YELLOW,Color.RED,Color.PINK,Color.LIGHT_GRAY};

    public void setFrame(JFrame frame){
        this.frame = frame;
    }
    @Override
    public void run() {
        Random random = new Random();
        while (true){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            Graphics graphics = frame.getGraphics();
            graphics.setColor(colors[random.nextInt(colors.length)]);
            graphics.drawLine(x,y,600,y);
            y +=10;
            if (y>=500){
                y = 100;
            }
        }
    }
}
