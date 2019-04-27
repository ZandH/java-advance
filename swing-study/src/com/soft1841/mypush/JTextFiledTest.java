package com.soft1841.mypush;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 清楚文本框中的文本内容
 *
 * @author 屏儿
 * 2019/04/26
 */
public class JTextFiledTest extends JFrame {
    public JTextFiledTest() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JTextField jt = new JTextField("aaa");
        jt.setColumns(20);
        jt.setFont(new Font("宋体", Font.PLAIN, 20));
        JButton jb = new JButton("清除");
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent args) {
                jt.setText("触发事件");

            }
        });
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent args) {
                System.out.println(jt.getText());
                jt.setText("");
                jt.requestFocus();
            }
        });
        c.add(jt);
        c.add(jb);
        setBounds(100,100,250,110);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTextFiledTest();
    }
}