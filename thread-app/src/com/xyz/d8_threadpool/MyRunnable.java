package com.xyz.d8_threadpool;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出了:helloworld==>" + i);
        }
        try {
            System.out.println(Thread.currentThread().getName() + "本任务与线程绑定,线程休眠了");
            Thread.sleep(10000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
