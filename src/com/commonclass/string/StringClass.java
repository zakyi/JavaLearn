package com.commonclass.string;


public class StringClass {

    /*
    test1():
        //只要有变量名参与的都相当于new+构造器方式创建String对象
     */
    public static void test1(){
        String s1 = "JavaEE";
        String s2 = "hadoop";

        String s3 = "JavaEEhadoop";
        String s4 = "JavaEE" + "hadoop";
        //只要有变量名参与的都相当于new+构造器方式创建String对象
        String s5 = s1 + "hadoop";
        String s6 = "JavaEE" + s2;

        System.out.println("**************test1()****************");//true
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s5 == s6);//false
    }
    /**
     * string对象的创建
     * 1.通过字面量的方式
     * 2.通过new + 构造器的方式
     */
    public static void main(String[] args) {
        //1.字面量
        // 字符串保存在常量池中, 引用存在栈中
        String s1 = "JavaEE";
        String s2 = "JavaEE";
        //2.构造器
        // 字符串保存在常量池中, 字符串引用保存在堆空间中, 引用在栈中
        String s3 = new String("JavaEE");
        String s4 = new String("JavaEE");

        test1();
    }

}
