package com.soft1841.dazuoye;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 * 制作大作业
 *
 * @author 屏儿
 * 2019/04/19
 */
public class workFrame extends JFrame implements ActionListener {
    private JLabel accountLabel, passwordLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private BgButton2 loginBtn, centerBtn;
    private int width;
    private int height;

    private workFrame() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.width;
        height = screenSize.height;
        init();
        setTitle("登录窗口");
        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void init() {
        setLayout(null);
        ShadePanel2 shadePanel2 = new ShadePanel2();
        shadePanel2.setLayout(null);
        shadePanel2.setBounds(0, 0, width, height);
        ImagePanel imagePanel = new ImagePanel();
        imagePanel.setLayout(null);
        imagePanel.setImgPath("beijing.jpg");
        imagePanel.setBounds(700, 100, 500, 400);
        Font font = new Font("楷体", Font.PLAIN, 25);
        accountLabel = new JLabel("账号");
        accountLabel.setFont(font);
        accountLabel.setForeground(new Color(8, 8, 8));
        accountField = new JTextField();
        accountField.setFont(font);
        passwordLabel = new JLabel("密码");
        passwordLabel.setFont(font);
        passwordLabel.setForeground(new Color(8, 8, 8));
        passwordField = new JPasswordField();

        loginBtn = new BgButton2();
        loginBtn.setPreferredSize(new Dimension(80, 80));

        loginBtn.setFocusPainted(false);
        loginBtn.setBgIcon("denglu.png");

        loginBtn.setContentAreaFilled(false);

        loginBtn.setBorderPainted(false);
        loginBtn.addActionListener(this);
        loginBtn.setBounds(100, 300, 50, 35);

        centerBtn = new BgButton2();
        centerBtn.setPreferredSize(new Dimension(80, 80));
        centerBtn.setFocusPainted(false);
        centerBtn.setBgIcon("quxiao.png");
        centerBtn.setContentAreaFilled(false);
        centerBtn.setBorderPainted(false);
        centerBtn.addActionListener(this);
        centerBtn.setBounds(280, 300, 50, 35);

        accountLabel.setBounds(100, 150, 100, 35);
        accountField.setBounds(150, 150, 200, 35);
        passwordLabel.setBounds(100, 220, 100, 35);
        passwordField.setBounds(150, 220, 200, 35);

        imagePanel.add(accountLabel);
        imagePanel.add(accountField);
        imagePanel.add(passwordLabel);
        imagePanel.add(passwordField);
        imagePanel.add(loginBtn);
        imagePanel.add(centerBtn);
        shadePanel2.add(imagePanel);
        add(shadePanel2);
    }

    public static void main(String[] args) {
        new workFrame();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String account = accountField.getText().trim();
        String password = String.valueOf(passwordField.getPassword());
        if ("1".equals(account) && "1".equals(password)) {
            //关闭登录
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            //打开主体线程
            FrameThread frameThread = new FrameThread();
            new Thread(frameThread).start();

        }
    }


    class ImagePanel extends JPanel {
        private String imgPath;

        public void setImgPath(String imgPath) {
            this.imgPath = imgPath;
        }

        @Override
        protected void paintComponent(Graphics g) {
            String basePath = System.getProperty("user.dir");
            Image bg = null;
            try {
                bg = ImageIO.read(new File(basePath + "/swing-study/src/img/" + imgPath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
        }
    }

    //背景渐变色图
    class ShadePanel2 extends JPanel {
        @Override
        protected void paintComponent(Graphics g1) {
            Graphics2D g = (Graphics2D) g1;
            super.paintComponent(g);
            int width = getWidth();
            int height = getHeight();
            //创建填充模式对象
            GradientPaint paint = new GradientPaint(0, 0, Color.white, 0, height, Color.pink);
            g.setPaint(paint);
            g.fillRect(0, 0, width, height);
        }
    }


    class BgButton2 extends JButton {
        private String bgIcon;

        public void setBgIcon(String bgIcon) {
            this.bgIcon = bgIcon;
        }

        @Override
        protected void paintComponent(Graphics g) {

            String basePath = System.getProperty("user.dir");
            Image bg = null;
            try {
                bg = ImageIO.read(new File(basePath + "/swing-study/src/img/" + bgIcon));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
        }
    }
}

