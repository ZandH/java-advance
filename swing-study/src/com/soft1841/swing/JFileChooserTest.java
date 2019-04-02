package com.soft1841.swing;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * 文件选择器组件
 */
public class JFileChooserTest extends JFrame implements ActionListener {
    private JButton chooseBtn;
    private JLabel pathLabel;
    private JFileChooser fileChooser;

    public JFileChooserTest() {

        init();
        setTitle("图片阅读程序");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    private void init() {
        chooseBtn = new JButton("选择文件");
        pathLabel = new JLabel("暂无选择");
        add(chooseBtn, BorderLayout.NORTH);
        Font font = new Font("微软雅黑", Font.BOLD, 26);
        pathLabel.setFont(font);
        add(pathLabel);
    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();

        } catch (Exception e) {
            e.printStackTrace();
        }
        new JFileChooserTest();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //创建JFileChooser对象
        fileChooser = new JFileChooser();
        //设置文件选择器的默认路径
//        fileChooser.setCurrentDirectory(new File("."));
        fileChooser.setCurrentDirectory(new File("D:\\"));
        //打开对话框，线程将被阻塞，知道选择框关闭
        int result = fileChooser.showOpenDialog(null);
        //用户点击了“确定”按钮
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            //将file的绝对路径显示在窗体中间
            pathLabel.setText(file.getAbsolutePath());
        }
    }
}

