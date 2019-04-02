package com.soft1841.io;

import java.io.*;

public class OutputEx {
    public static void main(String[] args) throws IOException {
        String str = "I Love Java";
        //1.通过字节流输出
        File file1 = new File("D:/out1.txt");
        if (!file1.exists()){
            file1.createNewFile();
        }
        //打印流--包装流
        OutputStream out = new FileOutputStream(file1);
        PrintStream printStream = new PrintStream(out);



    }
}
