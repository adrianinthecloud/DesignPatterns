package com.osfocus.www.patterns.proxy;

import java.util.concurrent.TimeUnit;

public class TestTarget {
    public void run() {
        System.out.println("In run() method");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void move() {
        System.out.println("In move() method");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
