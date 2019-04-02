package com.soft1841.swing;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 使用卡片布局
 *
 * @author 屏儿
 */
public class ImageViewerFrame extends JFrame implements ActionListener {
    private JButton chooseBtn;
    private JPanel centerLabel;
    private JFileChooser fileChooser;
    private CardLayout cardLayout;
    public ImageViewerFrame() {
        init();
        setTitle("使用卡片布局实现多图浏览功能");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        bottomPanel = new JPanel();
        chooseBtn = new JButton("选择图片");
        preBtn = new JButton("前一张");
        nextBtn = new
        add(chooseBtn,BorderLayout.NORTH);
        chooseBtn.addActionListener(this);


    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();

        } catch (Exception e) {
            e.printStackTrace();
        }
        new ImageViewerFrame();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==chooseBtn){
            System.out.println("choose");
        }
        if (e.getSource()==preBtn){
            System.out.println("previous");
        }
        if (e.getSource()==nextBtn){
            System.out.println("next");
        }

    }
}
