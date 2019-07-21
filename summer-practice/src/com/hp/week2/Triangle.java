package com.hp.week2;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out1 = System.out;
        PrintStream out2 = new PrintStream("./log_Pascal'sTriangle.txt");
        System.out.println("Please input a number");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.close();
        //定义循环变量
        int i;
        int j;
        int sum = 1;
        for (i = 1; i <= count; i++) {
            //为了做成等腰三角形对左的空格
            for (j = count; j >= i; j--) {
                System.setOut(out1);
                System.out.print(" ");
                System.setOut(out2);
                System.out.print(" ");
            }
            //运算杨辉三角数
            for (j = 1; j <= i; j++) {
                if (j > 1) {
                    sum = sum * (i - j + 1) / (j - 1);
                    System.setOut(out1);
                    System.out.print(sum + " ");
                    System.setOut(out2);
                    System.out.print(sum + " ");
                } else {
                    //在最左边加上一列1
                    System.setOut(out1);
                    System.out.print("1 ");
                    System.setOut(out2);
                    System.out.print("1 ");
                }
            }
            //换行
            System.setOut(out1);
            System.out.println();
            System.setOut(out2);
            System.out.println();
        }
    }
}
