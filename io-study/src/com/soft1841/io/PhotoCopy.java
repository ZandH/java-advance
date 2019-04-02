package com.soft1841.io;

import java.io.*;
import java.util.Scanner;

/**
 * 将控制台输入写入文件
 *
 * @author 屏儿
 * 2019/03/26
 */
public class PhotoCopy{
    public static void main(String[] args) throws IOException{
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输⼊");
        String inputString=scanner.nextLine();
        byte[]bytes=inputString.getBytes();
        File destFile1=new File("D:/sea.txt ");
        OutputStream outputStream=new FileOutputStream(destFile1);
        outputStream.write(bytes);
        File srcFile = new File("D:/sea.txt ");
        if (srcFile.exists()) {
            File destFile = new File("E:/sea.txt ");
            Reader in = new FileReader(srcFile);
            char[] chars = new char[(int) srcFile.length()];
            in.read(chars);
            Writer out = new FileWriter(destFile);
            out.write(chars);
            out.close();
            in.close();
        }else{
            System.out.println("该⽂件不存在");
        }
    }

}

