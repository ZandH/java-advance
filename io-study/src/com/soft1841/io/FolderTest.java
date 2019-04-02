package com.soft1841.io;

import java.io.File;

public class FolderTest {
    public static void main(String[] args) {
        //声明文件夹MY-CODE所在的目录
        String path = "D:/MY-CODE";
        //循环获得i值，并用i命名心得文件夹
        for (int i = 1; i <= 10; i++) {
            //根据新的目录创建File对象
            File folder = new File(path + "\\" + i);
            //文件不存在
            if (!folder.exists()) {
                //创建新的文件夹（包括不存在的父文件夹）
                folder.mkdirs();
            }
        }
        System.out.println("文件夹创建成功，请打开D盘查看！\n\nD盘文件及文件夹列表如下：");
        //根据路径名创建File对象
        File file = new File("D:/");
        //获得D盘的所有文件和文件夹
        File[] files = file.listFiles();
        //遍历files数组
        for (File folder : files) {
            //判断是否为文件
            if (folder.isFile())
                //输出D盘下所有文件的名称
                System.out.println(folder.getName() + "文件");
                //判断是否为文件夹
            else if (folder.isDirectory())
                //输出D盘下所有文件夹的名称
                System.out.println(folder.getName() + "文件夹");
        }
    }
}
