package com.hp.week3;

/**
 * Thread线程的应用程序
 *
 * @author 屏儿
 * 2019/07/24
 */
public class ThreadTest extends Thread{
    private int count = 10;

    @Override
    //重写run方法
    public void run() {
        while (true){
            //打印count变量
            System.out.print(count+" ");
            if (--count ==0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        //创建线程对象
        ThreadTest test = new ThreadTest();
        //启动线程
        test.start();
    }
}
