package com.soft1841.mypush;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 打印用户选项
 *
 * @author 屏儿
 * 2019/04/27
 */
public class CheckBoxTest extends JFrame {
    public CheckBoxTest() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        setBounds(100, 100, 170, 110);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        JCheckBox c1 = new JCheckBox("1");
        JCheckBox c2 = new JCheckBox("2");
        JCheckBox c3 = new JCheckBox("3");
        c.add(c1);
        c.add(c2);
        c.add(c3);
        JButton btn = new JButton("打印");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //在控制台分别输出三个复选框的选中状态
                System.out.println(c1.getText() + "按钮选中状态：" + c1.isSelected());
                System.out.println(c2.getText() + "按钮选中状态：" + c2.isSelected());
                System.out.println(c3.getText() + "按钮选中状态：" + c3.isSelected());
            }
        });
        c.add(btn);

    }

    public static void main(String[] args) {
        new CheckBoxTest();
    }
}
