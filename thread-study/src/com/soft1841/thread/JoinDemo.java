package com.soft1841.thread;

public class JoinDemo extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("活动开始");
    }

    public static void main(String[] args) throws InterruptedException{
        JoinDemo joinDemo = new JoinDemo();
        Thread thread = new Thread(joinDemo);
        Thread.sleep(2000);
        System.out.println("开始倒数");
        for (int i = 10;i>=1;i--){
            Thread.sleep(1000);
            System.out.println(i);
            if (i==1){
                thread.start();
                thread.join();
            }
        }

    }
}
