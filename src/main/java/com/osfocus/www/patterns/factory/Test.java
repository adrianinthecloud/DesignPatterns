package com.osfocus.www.patterns.factory;

public class Test {
    private static volatile int i = 0;

    public static void main(String args[]) {
        int a = 10;
        int b = 2;

        a = i;
        a = b;

        i = 19;

        System.out.println("i = " + i);
    }
}
