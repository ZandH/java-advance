package com.soft1841.io;

import java.awt.image.BufferedImage;
import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) {
        //定义字符串数组
        String content[] = {"你不喜欢我，","我一点都不介意。","因为我活下来，","不是为了取悦你！"};
        File file = new File("word.txt");
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        FileOutputStream fis = null;
        BufferedInputStream bis = null;
            try {
                fos = new FileOutputStream(file);
                bos = new BufferedOutputStream(fos);
                byte[] bContent = new byte[1024];
                for (int k = 0; k<content.length;k++){
                    bContent = content[k].getBytes();
                    bos.write(bContent);
            }
                System.out.println("写入成功！\n");
        } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bos.close();
                    fos.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    try {
        fis = new FileOutputStream(file);
        bis = new BufferedInputStream(bis);
        byte[] bContent = new byte[1024];
        int len = bis.read(bContent);
        System.out.println("文件中的信息是："+new String(bContent,0,len));

    }catch (IOException e){
        e.printStackTrace();
    }finally {
        try {
            bis.close();
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    }
}
