package com.soft1841.mypush;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListTest extends JFrame {
    public JListTest() {
        Container cp = getContentPane();
        cp.setLayout(null);
        //创建字符串数组，保存列表中的数据
        String[] contents = {"列表1", "列表2", "列表3", "列表4", "列表5", "列表6"};
        JList<String> j1 = new JList<>(contents);
        JScrollPane js = new JScrollPane(j1);
        js.setBounds(10, 10, 100, 109);
        cp.add(js);
        JTextArea area = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(area);
        scrollPane.setBounds(118, 10, 73, 80);
        cp.add(scrollPane);
        JButton btnNewButton = new JButton("确认");
        btnNewButton.setBounds(120, 96, 71, 23);
        cp.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取列表中选中的元素，返回java.util.List类型
                java.util.List<String> values = j1.getSelectedValuesList();
                area.setText("");
                for (String value : values) {
                    area.append(value + "\n");
                }

            }
        });
        setTitle("在这个窗体中使用了列表框");
        setSize(217,167);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JListTest();
    }
}
