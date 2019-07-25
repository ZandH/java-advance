package com.hp.week3;

/**
 * Runnable线程的应用程序
 *
 * @author 屏儿
 * 2019/07/24
 */
public class RunnableTest extends Object implements Runnable {
    private int count = 10;

    @Override
    public void run() {
        while (true) {
            System.out.print(count + " ");
            if (--count == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        //实现Runnable接口
        RunnableTest runnableTest = new RunnableTest();
        Thread thread = new Thread(runnableTest);
        //启动线程
        thread.start();
    }

}
