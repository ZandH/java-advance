package com.hp.week2;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 等腰三角形的应用程序
 *
 * @author 屏儿
 * 2019/07/17
 */
public class TranNumber {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out1 = System.out;
        PrintStream out2 = new PrintStream("log_TranNumber.txt");
        System.out.println("请输入行数：");
        Scanner scanner = new Scanner(System.in);
        //输入行数
        int count;
        count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            for (int j = count; j > i; j--) {
                //将等腰三角形左边空出来
                System.setOut(out1);
                System.out.print(" ");
                System.setOut(out2);
                System.out.print(" ");
            }
            for (int j = 0;j <= i;j++){
                //绘制等腰三角形
                System.setOut(out1);
                System.out.print("\u2664"+" ");
                System.setOut(out2);
                System.out.print("\u2664"+" ");
            }
            //换行
            System.setOut(out1);
            System.out.println();
            System.setOut(out2);
            System.out.println();
        }
    }
}
