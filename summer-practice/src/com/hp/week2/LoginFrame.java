package com.hp.week2;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import javax.swing.*;
import java.awt.*;

/**
 * Swing-null空布局管理器
 *
 * @author 屏儿
 * 2019/07/21
 */
public class LoginFrame extends JFrame {
    private JLabel accountLabel, passwordLabel, roleLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JComboBox<String> roleComboBox;
    private JButton confirmButton, cancelButton;
    private JLabel bgLabel;

    public LoginFrame() {
        init();
        setTitle("登录窗体");
        setSize(640, 480);
        setLocationRelativeTo(null);
        //设置窗体大小不可变
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        Font font = new Font("微软雅黑", Font.PLAIN, 18);
        accountLabel = new JLabel("账号");
        accountLabel.setFont(font);
        accountField = new JTextField();
        accountField.setFont(font);
        passwordLabel = new JLabel("密码");
        passwordLabel.setFont(font);
        passwordField = new JPasswordField();
        passwordField.setFont(font);
        roleLabel = new JLabel("角色");
        roleLabel.setFont(font);
        String[] roles = {"教师", "学生"};
        roleComboBox = new JComboBox<>(roles);
        roleComboBox.setFont(font);
        confirmButton = new JButton("确认");
        confirmButton.setFont(font);
        cancelButton = new JButton("取消");
        cancelButton.setFont(font);
        //窗体布局设置为空布局需要为每个组件定位
        setLayout(null);
        // setBounds 方法的四个参数分别为组件x，y坐标，组件宽，高
        accountLabel.setBounds(140,60,100,35);
        accountField.setBounds(240,60,260,35);
        passwordLabel.setBounds(140,130,100,35);
        passwordField.setBounds(240,130,260,35);
        roleLabel.setBounds(140,200,260,35);
        roleComboBox.setBounds(240,200,260,35);
        confirmButton.setBounds(160, 300, 100, 40);
        cancelButton.setBounds(380, 300, 100, 40);
        confirmButton.setUI(new BEButtonUI());
        cancelButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));

        add(accountLabel);
        add(accountField);
        add(passwordLabel);
        add(passwordField);
        add(roleComboBox);
        add(roleLabel);
        add(cancelButton);
        add(confirmButton);
        bgLabel = new JLabel();
        Icon bgIcon = new ImageIcon(LoginFrame.class.getResource("/img/1.jpg"));
        bgLabel.setIcon(bgIcon);
        bgLabel.setBounds(0, 0, 640, 480);
        add(bgLabel);
    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new LoginFrame();
    }
}

