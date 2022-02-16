package com.zakzakyi.Callable;

import javax.swing.plaf.FontUIResource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式3: 实现Callable接口
 *
 */
//1.创建一个Callable接口的实现
class NumThread implements Callable{
    //2.实现call方法,将此线程需要执行的操作声明在call方法中
    @Override
    public Object call() throws Exception {
        int sum=0;
        for(int i=0; i<100;i++){
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        NumThread numThread = new NumThread();
        //4.将此Callable接口实现类的对象作为参数传递到FutureTask构造器中,创建FutureTask对象
        FutureTask futureTask = new FutureTask(numThread);
        //5. 创建Thread构造器,传入FutureTask对象, 执行start运行线程
        new Thread(futureTask).start();
        //6.获取Callable的get方法的返回值
        try {
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
