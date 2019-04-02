package com.soft1841.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File path = new File("D:/sea.md");
        if (!path.exists()) {
            path.mkdir();
            for (int i = 1; i <= 10; i++) {
                File folder = new File(path + "/" + "chap" + i);
                if (!folder.exists()) {
                    folder.mkdirs();
                }
            }
        }
    }
}
