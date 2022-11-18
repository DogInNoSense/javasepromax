package com.xyz.d5_thread_synchronized_method;


public class ThreadDemo {
    public static void main(String[] args) {
        // 1.定义线程类,创建一个共享的账户对象
    Account acc = new Account("ICBC-111", 100000);


        // 2.创建2个线程对象,代表小明和小红同时进来
        new DrawThread(acc, "小明").start();
        new DrawThread(acc, "小红").start();
    }
}
