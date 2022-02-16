package com.zakzakyi.Callable;

import java.util.concurrent.Callable;

/**
 * 创建线程的方式3: 实现Callable接口
 *
 */

class NumThread implements Callable{
    @Override
    public Object call() throws Exception {
        for(int i=0; i<100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest {
}
