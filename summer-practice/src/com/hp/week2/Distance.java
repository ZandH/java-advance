package com.hp.week2;

import java.util.Random;

/**
 * 随机产生（x1，y1），（x2，y2）计算两点距离
 *
 * @author 屏儿
 * 2019/07/15
 */
public class Distance {
    public static void main(String[] args) {
        int x1;
        int y1;
        int x2;
        int y2;
        Random random = new Random();
        x1 = random.nextInt(10);
        x2 = random.nextInt(10);
        y1 = random.nextInt(10);
        y2 = random.nextInt(10);
        double distance = Math.sqrt(x1-x2) * (x1-x2)*(y1-y2);
        System.out.println("点("+x1+","+y1+")和点（"+x2+","+y2+")的距离是"+distance);

    }
}
