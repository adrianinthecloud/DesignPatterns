package com.osfocus.www.patterns.flyweight;

public class flyweight {
    public static void main(String args[]) {
        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = new String("ABC");

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s2 == s2: " + (s2 == s3));
        System.out.println("s2 == s3.intern(): " + (s2 == s3.intern()));
    }
}
