package com.soft1841.mypush;

import javax.swing.*;
import java.awt.*;

/**
 * 创建自动换行的文本域文件
 * @author 屏儿
 * 2019/04/27
 */
public class JTextAreaTest extends JFrame {
    public JTextAreaTest(){
        setSize(200,100);
        setTitle("定义自动换行的文本域");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();
        JTextArea jt = new JTextArea("文本域",6,6);
        jt.setLineWrap(true);
        cp.add(jt);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JTextAreaTest();
    }
}
