package com.soft1841.mypush;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 创建下拉列表框并添加到窗体中
 * @author 屏儿
 * 2019/04/28
 */
public class JComboBoxTest extends JFrame {
    public JComboBoxTest(){
        //省略非关键代码
        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.setBounds(110,11,80,21);
        comboBox.addItem("身份证");
        comboBox.addItem("军人证");
        comboBox.addItem("学生证");
        comboBox.addItem("工作证");
        getContentPane().add(comboBox);
        JLabel lblResult = new JLabel("");
        lblResult.setBounds(77,57,146,15);
        getContentPane().add(lblResult);
        JButton btnNewButton = new JButton("确定");
        btnNewButton.setBounds(200,10,67,23);
        getContentPane().add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent grg0) {
                //获取下拉列表中的选项
                lblResult.setText("您选择的是："+comboBox.getSelectedItem());
            }
        });

    }

    public static void main(String[] args) {

        new JComboBoxTest();
    }
}
