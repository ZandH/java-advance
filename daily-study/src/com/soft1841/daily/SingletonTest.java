package com.soft1841.daily;

/**
 * 单例模式测试程序
 * @author 屏儿
 * 2019/05/20
 */
public class SingletonTest {
    public static void main(String[] args) {
        //通过SingLeton的类方法SingLeton.getInstance（）获取唯一可用的对象
        Singleton object = Singleton.getInstance();
        //显示信息
        object.showMessage();
    }
}
