package com.soft1841.mypush;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 创建功能不同、外观不同的按钮
 * @author 屏儿
 * 2019/04/27
 */
public class JButtonTest extends JFrame {
    public JButtonTest(){
        Icon icon = new ImageIcon("src/1.jpg");
        setLayout(new GridLayout(3,2,5,5));
        Container c = getContentPane();
        JButton btn[] = new JButton[6];
        for (int i = 0;i<btn.length;i++){
            btn[i] = new JButton();
            c.add(btn[i]);
        }
        btn[0].setText("不可用");
        btn[0].setEnabled(false);
        btn[1].setText("有背景色");
        btn[1].setBackground(Color.YELLOW);
        btn[2].setText("无边框");
        btn[2].setBorderPainted(false);
        btn[3].setText("有边框");
        btn[3].setBorder(BorderFactory.createLineBorder(Color.RED));
        btn[4].setIcon(icon);
        btn[4].setToolTipText("图片按钮");
        btn[5].setText("可点击");
        btn[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹出确认对话框
                JOptionPane.showMessageDialog(JButtonTest.this,"点击按钮");
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("创建不同样式的按钮");
        setBounds(100,100,400,200);
    }

    public static void main(String[] args) {
        new JButtonTest();
    }
}
