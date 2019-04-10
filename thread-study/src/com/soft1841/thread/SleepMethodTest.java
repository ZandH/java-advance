package com.soft1841.thread;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * 在窗体中自动绘制彩色线段2
 * 2019.4.10
 */
public class SleepMethodTest extends JFrame {
    private static final long serialVersionUID = 1L;
    private Thread t;
    //定义颜色数组
    private static Color[] color = {Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,Color.orange,
            Color.YELLOW,Color.RED,Color.PINK,Color.LIGHT_GRAY};
    //创建随即对象
    private static final Random rand = new Random();
    //获取随机颜色值的方法
    private static Color getC(){
        //随机产生一个color数组长度范围内的数字，以此为索引获取颜色
        return color[rand.nextInt(color.length)];
    }
    public SleepMethodTest(){
        //创建匿名线程对象
        t = new Thread(new Draw());
        //启动线程
        t.start();
    }
    //定义内部类，用来在窗体中绘制线条
    class Draw implements Runnable{
        //定义初始坐标
        int x = 30;
        int y = 50;
        @Override
        //重写线程接口方法
        public void run() {
            //无限循环
            while (true){
                try {
                    //线程休眠0.1秒
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                //获取组件绘图上下文对象
                Graphics graphics = getGraphics();
                //设置绘图颜色
                graphics.setColor(getC());
                //绘制直线并递增垂直坐标
                graphics.drawLine(x,y,100,y++);
                if (y>=88){
                    y=50;
                }
            }
        }
    }

    public static void main(String[] args) {
        init(new SleepMethodTest(),200,100);
    }

    //初始化程序界面的方法
    private static void init(JFrame jFrame, int width, int height) {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(width,height);
        jFrame.setVisible(true);
    }
}
