package com.hp.week2;

import java.util.Scanner;

/**
 * 循环程序
 *
 * @author 屏儿
 * 2019/07/16
 */
public class Accumulation {
    public static void main(String[] args) {
        //定义一个变量a，赋初始值0
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        a = scanner.nextInt();
        //定义一个变量n，用来确定位数
        int n = 0;
        System.out.println("请输入位数：");
        n = scanner.nextInt();
        //定义循环条件
        int number;
        int c = 0;
        number = a;
        for (int i = 1; i < n; i++) {
            //将a增加十倍
            a = a * 10 + number;
            //将a的值赋给左侧的c
            c += a;
        }
        //定义一个求和的变量sum，循环结束后，输出sum的值
        int sum;
        sum = c + number;
        System.out.println("sum:" + sum);
    }
}
