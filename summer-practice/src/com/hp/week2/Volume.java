package com.hp.week2;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        double height = 5;
        double radius = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入高度：");
        height = scanner.nextDouble();
        System.out.println("请输入半径：");
        radius = scanner.nextDouble();
        //定义常量要final
        final double PI = 3.1415923;
        double volume = PI*radius*radius*height;
        System.out.println(volume);
    }
}
