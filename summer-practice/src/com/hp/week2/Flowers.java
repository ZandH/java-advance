package com.hp.week2;

/**
 * 水仙花数的应用程序
 *
 * @author 屏儿
 * 2019/07/16
 */
public class Flowers {
    public static void main(String[] args) {
        //水仙花数三位数，所以区间是100-999
        int start = 100;
        //下面括号里面的是右面的区间，为开区间
        while (start < 999) {
            start++;
            int hundred = start / 100;
            int ten = start / 10 % 10;
            int digit = start % 10;
            if (hundred * hundred * hundred + ten * ten * ten + digit * digit * digit == start) {
                System.out.println("水仙花数为：" + start);
            }
        }
    }
}
