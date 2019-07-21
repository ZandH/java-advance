package com.hp.week2;

import java.util.Scanner;

/**
 * 阶乘的应用程序
 *
 * @author 屏儿
 * 2019/07/16
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入一个正整数");
        long num;
        //定义result的初始值，从1开始
        long result = 1;
        num = scanner.nextLong();
        //循环条件，输入的数字大于0；为正整数
        while (num > 0) {
            result = result * num;
            num--;

        }
        System.out.println("计算出来的阶乘为：" + result);
    }
}
