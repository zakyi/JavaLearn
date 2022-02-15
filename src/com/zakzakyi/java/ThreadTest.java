package com.zakzakyi.java;

/**
 * 多线程创建:方式1:继承Thread类
 * 1.创建继承Thread类的子类
 * 2.重写Thread类的run
 * 3.创建对象
 * 4.调用start
 */

//* 1.创建继承Thread类的子类
class MyThread extends Thread{
//     * 2.重写Thread类的run

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest{
    public static void main(String[] args) {
//         * 3.创建对象
        MyThread myThread = new MyThread();
//         * 4.调用start
        myThread.start();

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }
}
