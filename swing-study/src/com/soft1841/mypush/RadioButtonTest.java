package com.soft1841.mypush;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 模拟选择邮件的发送方式
 *
 * @author 屏儿
 * 2019/04/27
 */
public class RadioButtonTest extends JFrame {
    public RadioButtonTest() {
        //省略非关键代码
        JRadioButton rbtnNormal = new JRadioButton("普通发送");
        rbtnNormal.setSelected(true);
        rbtnNormal.setFont(new Font("宋体", Font.PLAIN, 12));
        rbtnNormal.setBounds(20, 30, 75, 22);
        //为“普通发送”按钮添加动作事件监听
        rbtnNormal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (rbtnNormal.isSelected())
                    JOptionPane.showMessageDialog(null,
                            "您选择的是：" + rbtnNormal.getText(),
                            "提醒", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        getContentPane().add(rbtnNormal);
        JRadioButton rbtnpwd = new JRadioButton("加密发送");
        rbtnpwd.setFont(new Font("宋体", Font.PLAIN, 12));
        rbtnpwd.setBounds(100, 30, 75, 22);
        rbtnpwd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (rbtnpwd.isSelected())
                    JOptionPane.showMessageDialog(null,
                            "您选择的是：" + rbtnpwd.getText(),
                            "提醒", JOptionPane.INFORMATION_MESSAGE);


            }
        });
        getContentPane().add(rbtnpwd);
        /**
         * 创建按钮组，把交互面板中的单选按钮添加到按钮组中
         */
        ButtonGroup group = new ButtonGroup();
        group.add(rbtnNormal);
        group.add(rbtnpwd);
    }

    public static void main(String[] args) {
        RadioButtonTest frame = new RadioButtonTest();
        frame.setVisible(true);
    }
}
