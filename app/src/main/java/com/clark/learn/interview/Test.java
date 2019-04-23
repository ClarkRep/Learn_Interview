package com.clark.learn.interview;

/**
 * @author
 * @description
 * @date 2019/2/28
 */
public class Test {

    static String str2 = "haha";

    public static void main(String[] args) {
//        String str = "Hello";
//        add(str);
//        System.out.println(str);
//
//        A a = new A();
//        add(a);
//        System.out.print("A.a = " + a.a);
//
//        add(str2);
//        System.out.println(str2);

        String str3 = "hello";
        String str4 = "hello";
        System.out.println(str3 == str4);
    }

    public static void add(String str) {
        str += "World";
    }

    public static void add(A a) {
        a.a += 10;
    }

    public static class A {
        int a;
    }
}

