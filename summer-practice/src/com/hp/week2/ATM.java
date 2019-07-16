package com.hp.week2;

import java.util.Scanner;

/**
 * ATM自动取款机的程序
 *
 * @author 屏儿
 * 2019/07/15
 */
public class ATM {
    public static void main(String[] args) throws InterruptedException {
        //定义总金额
        int total = 1000;
        System.out.println("欢迎来到ATM存取款机");
        System.out.println("请插入银行卡");
        Thread.sleep(3000);
        System.out.println("************");
        System.out.println("1.取款");
        System.out.println("2.存款");
        System.out.println("3.查询余额");
        System.out.println("4.退出");
        System.out.println("************");
        //定义一个用来接收用户输入的变量
        int choice;
        //定义一个系统输入对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择你要的操作：");
        //接收一个整数 1 2 3 4
        choice = scanner.nextInt();
        if (choice == 1) {
            //用户输入取款
            System.out.println("请输入取款金额");
            int withdraw = scanner.nextInt();
            if (withdraw <= 1000) {
                total = total - withdraw;
                System.out.println("取了" + withdraw + "元，当前"+total);
            } else {
                System.out.println("余额不足！");
            }
        }
        if (choice == 2) {
            System.out.println("请输入存款金额");
            int deposit = scanner.nextInt();
            total = total + deposit;
            System.out.println("存了" + deposit + "元，当前余额为：" + total);
        }
        if (choice == 3) {
            System.out.println("当前余额是：" + total);
        }
        if (choice == 4) {
            System.out.println("欢迎下次再来");
            //线程休眠
            Thread.sleep(2000);
            //系统结束
            System.exit(0);
        }
    }
}
