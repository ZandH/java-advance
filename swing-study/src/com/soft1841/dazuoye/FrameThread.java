package com.soft1841.dazuoye;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.net.URL;


public class FrameThread extends JFrame implements Runnable {
    private Container container;
    private JPanel topPanel, leftPanel, centerPanel, rightPanel, workPanel, desktopPanel;
    private JLabel j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17;
    private JButton btn1, btn2, btn3, btn4, saveBtn;
    private JTable jTable;
    private JFileChooser jFileChooser;
    private JTextArea jTextArea;

    public FrameThread() {
        init();
        setTitle("WPS");

        setLocationRelativeTo(null);

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setVisible(true);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void run() {

    }

    private void init() {

        container = getContentPane();
        container.setLayout(null);
        //顶部topPanel
        topPanel = new JPanel();
        topPanel.setLayout(null);
        topPanel.setBounds(0, 0, 1950, 100);
        topPanel.setBackground(new Color(99, 152, 240));
        Font font = new Font("楷体", Font.PLAIN, 30);
        j1 = new JLabel("WPS 2019");
        j1.setFont(font);
        j1.setBounds(30, 26, 200, 50);
        btn4 = new JButton("个人信息");
        btn4.setBackground(new Color(255, 255, 255));
        btn4.setBounds(1750, 30, 150, 40);
        JTextField txt = new JTextField("搜索文档、模板");
        txt.setBounds(1500, 37, 200, 30);
        txt.setBorder(BorderFactory.createMatteBorder(2, 5, 2, 2, Color.gray));
        URL url = FrameThread.class.getResource("/img/sousuo.png");
        Icon icon = new ImageIcon(url);
        JLabel imgLabel = new JLabel();
        imgLabel.setIcon(icon);
        imgLabel.setBounds(1671, 37, 130, 30);
        topPanel.add(imgLabel);
        topPanel.add(txt);
        topPanel.add(j1);
        topPanel.add(btn4);
        //左部leftPanel
        leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setBounds(0, 60, 290, 940);
        leftPanel.setBackground(new Color(232, 232, 232));
        Font font3 = new Font("黑体", Font.PLAIN, 20);
        btn1 = new JButton("从模板中新建");
        btn1.setBackground(new Color(99, 152, 240));
        btn1.setBounds(30, 180, 220, 60);
        btn2 = new JButton("打开");
        btn2.setBackground(new Color(232, 232, 232));
        btn2.setBounds(30, 270, 220, 60);
        btn1.setFont(font3);
        btn2.setFont(font3);
        btn1.setForeground(Color.BLUE);
        btn2.setForeground(new Color(99, 152, 240));
        j7 = new JLabel(" ");
        j7.setFont(font3);
        j7.setBounds(65, 340, 200, 20);
        j8 = new JLabel("当前的日期时间");
        j8.setBounds(20, 500, 200, 20);
        j8.setFont(font3);
        //加入时间线程
        JLabel timeLabel = new JLabel();
        TimeThread timeThread = new TimeThread();
        timeThread.setTimeLabel(timeLabel);
        new Thread(timeThread).start();
        timeLabel.setBounds(10, 530, 500, 20);
        Font timeFont = new Font("宋体", Font.PLAIN, 20);
        timeLabel.setFont(timeFont);
//        URL url2 = FrameThread.class.getResource("/img/xinzeng.png");
//        Icon icon2 = new ImageIcon(url2);
//        JLabel imgLabel2 = new JLabel();
//        imgLabel.setIcon(icon2);
//        imgLabel.setBounds(10, 37, 130, 30);
//        leftPanel.add(imgLabel2);
        leftPanel.add(timeLabel);
        leftPanel.add(btn1);
        leftPanel.add(btn2);
        leftPanel.add(j7);
        leftPanel.add(j8);

        //右边rightPanel
        rightPanel = new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setBounds(1600, 60, 320, 940);
        rightPanel.setBackground(new Color(232, 232, 232));
        Font font2 = new Font("微软雅黑", Font.PLAIN, 17);
        j2 = new JLabel("快速访问");
        j2.setBounds(60, 180, 100, 20);
        j2.setForeground(new Color(99, 152, 240));

        j3 = new JLabel("最近访问");
        j3.setBounds(60, 250, 100, 20);
        j3.setForeground(new Color(99, 152, 240));

        j4 = new JLabel("PDF转Word");
        j4.setBounds(60, 290, 100, 20);
        j4.setForeground(new Color(99, 152, 240));

        j5 = new JLabel("云文档");
        j5.setBounds(60, 330, 100, 20);
        j5.setForeground(new Color(99, 152, 240));

        j6 = new JLabel("文档修复");
        j6.setBounds(60, 370, 100, 20);
        j6.setForeground(new Color(99, 152, 240));

        j12 = new JLabel("团队共享");
        j12.setBounds(60, 410, 100, 20);
        j12.setForeground(new Color(99, 152, 240));

        j13 = new JLabel("WPS画报");
        j13.setBounds(60, 450, 100, 20);
        j13.setForeground(new Color(99, 152, 240));

        j14 = new JLabel("WPS便签");
        j14.setBounds(60, 490, 100, 20);
        j14.setForeground(new Color(99, 152, 240));

        j15 = new JLabel("金山贷款");
        j15.setBounds(60, 530, 100, 20);
        j15.setForeground(new Color(99, 152, 240));

        j16 = new JLabel("WPS精品课");
        j16.setBounds(60, 570, 100, 20);
        j16.setForeground(new Color(99, 152, 240));

        j17 = new JLabel("设置");
        j17.setBounds(60, 720, 100, 20);
        j17.setForeground(new Color(99, 152, 240));


        j12.setFont(font2);
        j13.setFont(font2);
        j14.setFont(font2);
        j15.setFont(font2);
        j16.setFont(font2);
        j17.setFont(font2);

        j6.setFont(font2);
        j5.setFont(font2);
        j4.setFont(font2);
        j3.setFont(font2);
        j2.setFont(font2);


        rightPanel.add(j12);
        rightPanel.add(j13);
        rightPanel.add(j14);
        rightPanel.add(j15);
        rightPanel.add(j16);
        rightPanel.add(j17);

        rightPanel.add(j2);
        rightPanel.add(j3);
        rightPanel.add(j4);
        rightPanel.add(j5);
        rightPanel.add(j6);
        //中间centerPanel
        centerPanel = new JPanel();
        centerPanel.setLayout(null);
        centerPanel.setBackground(new Color(245, 245, 245));
        centerPanel.setBounds(270, 60, 1420, 1000);

        workPanel = new JPanel();
        workPanel.setBounds(50, 50, 500, 200);
        j9 = new JLabel("   我的电脑  ");
        Font font4 = new Font("微软雅黑", Font.CENTER_BASELINE, 20);
        j9.setForeground(new Color(99, 152, 240));
        j9.setFont(font4);
        workPanel.setBackground(new Color(245, 245, 245));
        workPanel.add(j9);

        j2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextArea.setVisible(false);
                desktopPanel.setVisible(false);
                jTable.setVisible(false);
                jTable.getTableHeader().setVisible(false);
                workPanel.setVisible(true);
                centerPanel.add(workPanel);
            }
        });

        desktopPanel = new JPanel();
        desktopPanel.setBounds(50, 50, 100, 200);
        j10 = new JLabel("最近访问");
        j10.setFont(font4);
        desktopPanel.setBackground(new Color(245, 245, 245));
        desktopPanel.add(j10);


        Object[][] table = {
                new Object[]{"软件1841课件"},
                new Object[]{"软件1841课件"},
                new Object[]{"软件1841课件"},
                new Object[]{"软件1841课件"},
                new Object[]{"软件1841课件"},
                new Object[]{"软件1841课件"},
                new Object[]{"软件1841课件"},
                new Object[]{"软件1841课件"},
                new Object[]{"软件1841课件"},
                new Object[]{"软件1841课件"},
                new Object[]{"软件1841课件"},
                new Object[]{"软件1841课件"},
                new Object[]{"软件1841课件"},
        };
        Object[] title = {"1"};
        jTable = new JTable(table, title);
        jTable.setBounds(20, 230, 1300, 500);
        jTable.getTableHeader().setBounds(20, 200, 1300, 30);
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        jTable.setRowHeight(50);
        jTable.setFont(font2);
        jTable.getTableHeader().setFont(font2);
        jTable.setBackground(new Color(245, 245, 245));


        j3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextArea.setVisible(false);
                workPanel.setVisible(false);
                desktopPanel.setVisible(true);
                jTable.setVisible(true);
                jTable.getTableHeader().setVisible(true);
                centerPanel.add(jTable.getTableHeader());
                centerPanel.add(jTable);
                centerPanel.add(desktopPanel);
            }
        });


        saveBtn = new JButton("保存");
        jTextArea = new JTextArea();
        jTextArea.setBounds(20, 150, 1300, 500);
        jTextArea.setFont(font4);

        jTextArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(jTextArea);
        //设置垂直滚动条
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setVisible(true);
                workPanel.setVisible(false);
                desktopPanel.setVisible(false);
                jTable.setVisible(false);
                jTable.getTableHeader().setVisible(false);
                jFileChooser = new JFileChooser();
                //设置文件选择器的默认路径
                jFileChooser.setCurrentDirectory(new File("D:\\Mine"));
                jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int result = jFileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = jFileChooser.getSelectedFile();
                    byte[] bytes = null;
                    try {
                        InputStream inputStream = new FileInputStream(file);
                        bytes = new byte[(int) file.length()];
                        inputStream.read(bytes);
                        inputStream.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    String str = new String(bytes);
                    jTextArea.setText("");
                    jTextArea.append(str);
                }
                centerPanel.add(jTextArea);
            }
        });

        //各组件加入到container容器中
        container.add(topPanel);
        container.add(leftPanel);
        container.add(rightPanel);
        container.add(centerPanel);
    }
}
