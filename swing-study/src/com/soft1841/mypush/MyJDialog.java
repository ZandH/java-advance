package com.soft1841.mypush;

import javax.swing.*;
import java.awt.*;

/**
 * 第一个对话框窗体的应用
 *
 * @author 屏儿
 * 2019/04/25
 */
class MyJDialog extends JDialog {
    public MyJDialog(MyFrame frame) {
        //实例化一个JDialog窗体，指定对话框的父窗体、窗体标题和类型
        super(frame, "第一个JDialog窗体", true);
        Container container = getContentPane();
        container.add(new JLabel("你的小宝宝已上线"));
        setBounds(120, 120, 100, 100);

    }

}
