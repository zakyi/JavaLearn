package com.zakzakyi.java;

/**
 * 测试Thread类中的常用方法
 * 1.start
 * 2.run
 * 3.setname:设置线程名字
 * 4.yield:释放CPU占用
 *
 */

class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            if(i%20==0){
                Thread.currentThread().yield();
            }
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            if(i%20==0){
                Thread.currentThread().yield();
            }
        }
    }
}

public class ThreadMethodTest {
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");

        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();
        m1.setName("m1线程");
        m2.setName("m2线程");
        m1.start();
        m2.start();
    }
}
