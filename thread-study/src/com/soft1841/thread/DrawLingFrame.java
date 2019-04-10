package com.soft1841.thread;


import javax.swing.*;
import java.awt.*;

/**
 * 在窗体中自动绘制彩色线段1
 * 2019.4.10
 */
public class DrawLingFrame extends JFrame {
    public DrawLingFrame(){
        init();
        setTitle("绘制彩色线段");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void init(){
        getContentPane().setBackground(new Color(0,0,0));
        DrawLineThread drawLineThread = new DrawLineThread();
        drawLineThread.setFrame(this);
        new Thread(drawLineThread).start();
    }

    public static void main(String[] args) {
        new DrawLingFrame();
    }
}