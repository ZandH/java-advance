package com.hp.week3;

import java.io.File;

/**
 * 遍历文件夹的应用程序
 *
 * @author 屏儿
 * 2019/07/22
 */
public class FolderTest {
    public static void main(String[] args) {
        //要遍历的路径
        String path = "D:/Mine";
        //获取其file对象
        File file = new File(path);
        //遍历path下的文件和目录，放在File数组中
        File[] fs = file.listFiles();
        //遍历File[]数组
        for (File f : fs) {
            //若非目录（即文件），则打印
            if (!f.isDirectory()) ;
            System.out.println(f);
        }
    }
}
