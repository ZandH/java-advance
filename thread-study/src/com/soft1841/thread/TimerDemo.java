package com.soft1841.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        TimerTask task1 = new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        };
        TimerTask task2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        Timer timer = new Timer();
        timer.schedule(task1, 0, 1000);
        timer.schedule(task2, 1000, 1000);
    }
}
