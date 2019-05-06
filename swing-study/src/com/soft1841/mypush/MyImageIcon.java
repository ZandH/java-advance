package com.soft1841.mypush;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 为标签设置图标
 *
 * @author 屏儿
 * 2019/04/26
 */
public class MyImageIcon extends JFrame {
    public MyImageIcon(){
        Container container = getContentPane();
        //创建一个标签
        JLabel j1 = new JLabel("这是一个JFrame窗体",JLabel.CENTER);
        //获取图片所在的URL
        URL url = MyImageIcon.class.getResource("top.png");
        Icon icon = new ImageIcon(url);
        j1.setHorizontalAlignment(SwingConstants.CENTER);
        j1.setOpaque(true);
        container.add(j1);
        setSize(300,200);
        setVisible(true);
        //设置窗体关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MyImageIcon();
    }
}
