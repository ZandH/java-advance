package com.hp.week2;

import java.util.Scanner;

/**
 * 求最大值和最小值的应用程序
 *
 * @author 屏儿
 * 2019/07/17
 */
public class MinMaxNum {
    public static void main(String[] args) {
        final int count = 5;
        int n;
        int min = 32767;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.println("Please input a number");
            n = scanner.nextInt();
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        int sum;
        sum = max + min;
        System.out.println("最小值" + min + "    最大数为" + max + "并且他们的和为" + sum);
    }
}
