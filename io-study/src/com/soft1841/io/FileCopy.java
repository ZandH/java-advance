package com.soft1841.io;

import java.io.*;
import java.util.UUID;

/**
 * 文件复制操作
 * @author 屏儿
 * 2019/03/26
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        //指定源文件
        File srcFile = new File("D:/code.jpg");
        String srcFileName = srcFile.getName();
        int position = srcFileName.indexOf(".");
        //qude
        String suffixName = srcFileName.substring(position+1);
        //xinde
        String newName = UUID.randomUUID().toString();
        //制定目标文件
        File destFile = new File("E:/bg.jbg");
        //创建一个字节数组，大小为源文件长度，长度转成int
        byte[] bytes = new byte[(int) srcFile.length()];
        //创建字节输入流
        InputStream in = new FileInputStream(srcFile);
        //将源文件读入字节数组
        in.read(bytes);
        //输出字节数组的长度
        System.out.println(bytes.length/1024+"k");
        //创建字节输出流
        OutputStream out = new FileOutputStream(destFile);
        //将字节数组输出到目标文件
        out.write(bytes);
        //关闭输入输出流
        out.close();
    }
}
