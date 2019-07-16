package com.hp.week2;

import java.util.Scanner;
import java.util.SplittableRandom;

public class LoginService {
    public static void main(String[] args) {
        String password;
        String account;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
        account = scanner.nextLine();
        System.out.println("请输入密码：");
        password = scanner.nextLine();
        if ("admin".equals(account) && "123456".equals(password)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
