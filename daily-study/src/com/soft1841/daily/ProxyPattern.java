package com.soft1841.daily;

/**
 * Java设计模式
 *
 * @author 屏儿
 * 2019/05/23
 */
public class ProxyPattern {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}
