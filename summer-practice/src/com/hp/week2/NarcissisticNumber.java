package com.hp.week2;

import java.util.Scanner;

/**
 * 水仙花数程序
 *
 * @author 屏儿
 * 2019/07/15
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        //定义一个三位数变量
        int number;
        //定义输入类
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a number:");
        number = scanner.nextInt();
        //定义百、十、个位数的变量
        int hundred;
        int ten;
        int digit;
        //算出百位数
        hundred = number / 100;
        //算出十位数
        ten = number % 100 / 10;
        //算出个位数
        digit = number % 10;
        //判断是否为水仙花数(阿姆斯特朗数）
        if (number == hundred * hundred * hundred + ten * ten * ten + digit * digit * digit) {
            System.out.println(number+"是水仙花数");

        }else {
            System.out.println(number+"不是水仙花数");
        }
    }
}
