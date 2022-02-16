package com.commonclass.string;

/**
 * String的使用
 *  String常量的不可变性
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        //s1 = "hello";
        //1.相同的String常量在常量池中使用同一地址
        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("***************");

        String s3 = "abc";
        s3+="def";
        System.out.println(s3);
        System.out.println("***************");
        //2.修改String变量值时, 会在常量池中新增一个常量, 而不是修改原有的常量
        String s4 = "abc";
        String s5 = s4.replace("a","m");
        System.out.println(s5);


    }



}
