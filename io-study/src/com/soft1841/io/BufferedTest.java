package com.soft1841.io;

import java.io.*;
import java.nio.Buffer;

public class BufferedTest {
    public static void main(String[] args) throws IOException {
        //定义字符串数组
        String content[] = {"你不喜欢我，", "我一点都不介意。", "因为我活下来，", "不是为了取悦你！"};
        //创建文本对象
        File file = new File("word.txt");
        try {
            //创建FileWrite类对象
            FileWriter fw = new FileWriter(file);
            BufferedWriter bufw = new BufferedWriter(fw);
            // 遍历循环数组
            for (int k = 0; k < content.length; k++) {
                bufw.write(content[k]);
                bufw.newLine();
            }
            bufw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fr = new FileReader(file);
            //创建BufferedReader类对象
            BufferedReader buff = new BufferedReader(fr);
            String s = null;
            int i = 0;
            //如果文件的文本行数不为null，则进入循环
            while ((s = buff.readLine()) != null) {
                i++;
                System.out.println("第" + i + "行" + s);
            }
            buff.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
