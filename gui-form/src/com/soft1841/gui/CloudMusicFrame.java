package com.soft1841.gui;

import javax.swing.*;
import java.awt.*;

public class CloudMusicFrame {
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JButton 搜索Button;
    private JButton 发现Button;
    private JButton MVButton;
    private JButton 朋友Button;
    private JPanel centerPanel;
    private JLabel banner;
    private JPanel musicPanel;
    private JLabel music1;
    private JLabel music2;
    private JLabel music3;
    private JLabel music4;
    private JLabel music5;

    public static void main(String[] args) throws Exception {
        //使用windows默认风格
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        JFrame frame = new JFrame("CloudMusicFrame");
        frame.setContentPane(new CloudMusicFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 490);
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
