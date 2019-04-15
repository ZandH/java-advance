package com.soft1841.thread;

public class Rabbit implements Runnable {
    private Thread tortoiseThread;
    public void setTortoiseThread(Thread tortoiseThread){
        this.tortoiseThread = tortoiseThread;
    }
    @Override
    public void run() {
        //循环10次模拟赛跑的过程
        for (int i = 1;i<=10;i++){
            try {
                //线程休眠0.1秒，模拟兔子在跑步
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            //显示兔子的跑步距离
            System.out.println("兔子跑了"+i*10+"米");
            if (i ==7){
                //
                System.out.println("兔子开始睡觉");
                try{
                    tortoiseThread.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
