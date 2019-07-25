package com.hp.week3;

import com.soft1841.thread.DrawLineThread;
import sun.java2d.loops.DrawLine;

import javax.swing.*;
import java.awt.*;

/**
 * 绘制线条的应用程序
 *
 * @author 屏儿
 * 2019/07/25
 */
public class DrawLingFrame extends JFrame {
    public DrawLingFrame() {
        init();
        setTitle("绘制彩色线条");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init() {
        getContentPane().setBackground(new Color(0, 0, 0));
        DrawLineThread drawLineThread = new DrawLineThread();
        drawLineThread.setFrame(this);
        new Thread(drawLineThread).start();
    }

    public static void main(String[] args) {
        new DrawLingFrame();
    }
}
