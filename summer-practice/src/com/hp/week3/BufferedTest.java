package com.hp.week3;

import java.io.*;

/**
 * 带缓冲的输入输出流的应用程序
 *
 * @author 屏儿
 * 2019/07/23
 */
public class BufferedTest {
    public static void main(String[] args) {
        String[] content = {"你走你的阳光道，", "我走我的光明大道，",
                "从此我们，", "不再相见！"};

        File file = new File("D:/word.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fw);
            for (int i = 0; i < content.length; i++) {
                bufferedWriter.write(content[i]);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s = null;
            int k = 0;
            while ((s = bufferedReader.readLine()) != null) {
                k++;
                System.out.println("第" + k + "行：" + s);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
