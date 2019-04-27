package com.soft1841.mypush;

import javax.swing.*;
import java.awt.*;

/**
 * 创建一个带滚动字条的文字编辑器
 * @author 屏儿
 * 2019/04/25
 */
public class JScrollPaneTest extends JFrame {
    public JScrollPaneTest() {
        Container c = getContentPane();
        //创建文本区域组件，文本域默认大小为20行50列
        JTextArea ta = new JTextArea(20, 50);
        //创建JScrollPane滚动面板，并将文本域放到滚动面板中
        JScrollPane sp = new JScrollPane(ta);
        c.add(sp);
        setTitle("带滚动条的文字编译器");
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollPaneTest();
    }
}
