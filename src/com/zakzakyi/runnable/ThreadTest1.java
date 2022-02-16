package com.zakzakyi.runnable;

/**
 * 创建多线程的方式2:实现Runnable接口
 * 1. 创建一个实现Runnable接口的类
 * 2. 实现Runnable中的抽象方法:run()
 * 3. 创建实现类的对象
 * 4. 将此对象作为参数传入Thread类的构造器中, 创建Thread类的对象
 * 5. 通过Thread类的对象调用start()
 */

//1.
class MThread implements Runnable{
    //2.
    @Override
    public void run() {
        for(int i=0; i<100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}


public class ThreadTest1 {
    public static void main(String[] args) {
        //3.
        MThread mThread = new MThread();
        //4.  5.
        new Thread(mThread).start();
    }
}
