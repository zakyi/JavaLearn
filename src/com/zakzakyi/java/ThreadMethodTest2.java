package com.zakzakyi.java;

/**
 * join():在线程a中调用线程b的join方法,此时线程a进入阻塞状态,等待b线程执行完毕
 */

public class ThreadMethodTest2 {
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");
        MyThread2 m1 = new MyThread2();
        m1.setName("m1线程");
        m1.start();
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            if(i%20==0&&i!=0){
                try {
                    m1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
