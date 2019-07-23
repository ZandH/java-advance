package com.hp.week3;


import java.io.*;

/**
 * 带缓冲的输入输出流的应用程序
 *
 * @author 屏儿
 * 2019/07/23
 */
public class BufferedStreamTest {
    public static void main(String[] args) {
        String content[] = {"你不喜欢我，", "我一点都不介意，", "因为我活下来，", "不是为了取悦你！"};
        File file = new File("D:/word.txt");
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        FilterInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            byte[] bContent = new byte[1024];
            for (int k = 0; k < content.length; k++) {
                bContent = content[k].getBytes();
                bos.write(bContent);
            }
            System.out.println("写入成功！\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
                fis.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
