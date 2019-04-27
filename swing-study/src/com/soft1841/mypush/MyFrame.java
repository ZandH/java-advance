package com.soft1841.mypush;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    public MyFrame() {
        Container container = getContentPane();
        container.setLayout(null);
        JButton b1 = new JButton("点击领取何某人");
        b1.setBounds(10, 10, 180, 21);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //创建MyJDialog对话框
                MyJDialog dialog = new MyJDialog(MyFrame.this);
                dialog.setVisible(true);
            }

        });
        container.add(b1);
        container.setBackground(Color.WHITE);
        setSize(200, 200);
        //窗口关闭后结束程序
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
