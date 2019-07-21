package com.hp.week2;

import java.util.Scanner;

/**
 * 因式分解的应用程序
 *
 * @author 屏儿
 * 2019/07/16
 */
public class Factorization {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner scanner = new Scanner(System.in);
        int factorization = scanner.nextInt();
        System.out.println(factorization + "=");
        for (int i = 2; i <= factorization; i++) {
            while (factorization != i) {
                if (factorization % i == 0) {
                    System.out.println(i + "*");
                    factorization = factorization / i;
                } else
                    break;
                ;
            }
        }
        System.out.println(factorization);
    }
}
