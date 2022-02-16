package com.zakzakyi.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 创建线程方式4:线程池
 *  思路:提前创建很多线程,放入线程池中,使用时直接获取,使用完放回池中.
 *
 */
class NumberThread implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName() +": "+ i);
            }
        }
    }
}
class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName() +": "+ i);
            }
        }
    }
}



public class ThreadTest {
    public static void main(String[] args) {
        //1.创建线程池,指定线程数量
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        //设置线程池属性
            //强转到子类
        ThreadPoolExecutor executorService1 = (ThreadPoolExecutor) executorService;
            //设置属性
        //核心池数量
        executorService1.setCorePoolSize(15);

        //2.执行线程,需要Runnable接口的对象
        executorService.execute(new NumberThread());//适合使用于Runnable
        executorService.execute(new NumberThread1());

        //2.需要Callable接口的对象
//        executorService.submit();//适合使用于Callable

        //3.关闭连接池
        executorService.shutdown();


    }
}
