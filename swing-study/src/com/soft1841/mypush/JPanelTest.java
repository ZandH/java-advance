package com.soft1841.mypush;

import javax.swing.*;
import java.awt.*;

/**
 * JPanel面板的练习
 *
 * @author 屏儿
 * 2019/04/25
 */
public class JPanelTest extends JFrame {
    public JPanelTest() {
        Container c = getContentPane();
        //将整个容器设置为2行1列的网格布局，组件水平间隔10像素，垂直间隔10像素
        c.setLayout(new GridLayout(2,1,10,10));
        //初始化一个面板，此面板使用1行3列的网格布局，组件水平间隔10像素，垂直间隔10像素
        JPanel p1 = new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel p2 = new JPanel(new BorderLayout());

        JPanel p3 = new JPanel(new GridLayout(1, 2, 10, 10));

        JPanel p4 = new JPanel(new GridLayout(2, 1, 10, 10));

        //给每个面板都添加边框和标题，使用BorderFactory工厂类生成标题的边框对象
        p1.setBorder(BorderFactory.createTitledBorder("面板1"));
        p2.setBorder(BorderFactory.createTitledBorder("面板2"));
        p3.setBorder(BorderFactory.createTitledBorder("面板3"));
        p4.setBorder(BorderFactory.createTitledBorder("面板4"));

        //在面板中添加按钮
        p1.add(new JButton("b1"));
        p1.add(new JButton("b1"));
        p1.add(new JButton("b1"));
        p1.add(new JButton("b1"));
        p2.add(new JButton("b2"), BorderLayout.WEST);
        p2.add(new JButton("b2"), BorderLayout.EAST);
        p2.add(new JButton("b2"), BorderLayout.NORTH);
        p2.add(new JButton("b2"), BorderLayout.SOUTH);
        p2.add(new JButton("b2"));
        p3.add(new JButton("b3"));
        p3.add(new JButton("b3"));
        p4.add(new JButton("b4"));
        p4.add(new JButton("b4"));
        //在容器中添加面板
        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        setTitle("在这个窗体中使用了面板");
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


    }

    public static void main(String[] args) {
        new JPanelTest();
    }
}
