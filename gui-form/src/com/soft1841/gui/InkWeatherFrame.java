package com.soft1841.gui;

import javax.swing.*;

public class InkWeatherFrame {
    private JPanel mainPane;
    private JPanel leftPanel;
    private JButton 天气Button;
    private JButton 时景Button;
    private JLabel Label1;
    private JLabel Label2;
    private JLabel Label3;
    private JLabel Label4;
    private JButton button3;
    private JPanel centerPanel;
    private JLabel Label5;
    private JPanel weatherPanel;
    private JLabel Label6;
    private JLabel Label7;
    private JLabel Label8;
    private JScrollPane gundongPanel;
    private JPanel huadongPanle;
    private JList list1;

    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        JFrame frame = new JFrame("InkWeatherFrame");
        frame.setContentPane(new InkWeatherFrame().mainPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 490);
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
