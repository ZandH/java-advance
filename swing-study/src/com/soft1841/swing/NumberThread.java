package com.soft1841.swing;
import javax.swing.*;
import java.awt.*;
public class NumberThread extends JFrame{
    private JLabel numberLabel;
    private JLabel localTime;
    private JPanel numberPanel;
    private JPanel localPanel;
    public NumberThread(){
        init();
        setTitle("多线程");
        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void init(){
        numberLabel = new JLabel();
        localTime = new JLabel();
        Font font = new Font("微软雅黑",Font.PLAIN,60);
        numberLabel.setFont(font);
        localTime.setFont(font);
        Container c = getContentPane();
        setLayout(new GridLayout(2,2,10,10));
        JPanel p1 = new JPanel(new BorderLayout());
        JPanel p2 = new JPanel(new GridLayout(3,2,10,10));
        p1.setBorder(BorderFactory.createTitledBorder("System Time"));
        p2.setBorder(BorderFactory.createTitledBorder("Random Number"));
        p1.add(localTime);
        p2.add(numberLabel);
        p1.setBackground(new Color(246,162,179));
        p2.setBackground(new Color(187,222,251));
        c.add(p1);
        c.add(p2);
        NumberThreadTest threadTest = new NumberThreadTest();
        LocalTimeTest test = new LocalTimeTest();
        test.setLocalTime(localTime);
        threadTest.setNumberLabel(numberLabel);
        threadTest.start();
        test.start();
    }
    public static void main(String[] args) {
        new NumberThread();
    }

}
