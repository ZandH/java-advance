package com.soft1841.io;

import java.io.*;

/**
 * 文本复制操作
 *
 * @author 屏儿
 * 2019/03/26
 */
public class TxtCopy {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:/Hello.txt");
        File destFile = new File("D:/Hello副本.txt");
        Reader in = new FileReader(srcFile);
            char[] chars = new char[(int) srcFile.length()];
            in.read(chars);
            Writer out = new FileWriter(destFile);
            out.write(chars);
            out.close();
            in.close();

    }
}
