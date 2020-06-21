package com.osfocus.www.patterns.proxy;

import java.util.concurrent.TimeUnit;

public class Plane implements Movable {
    @Override
    public void move() {
        System.out.println("In plane.move() method");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print(int miles) {
        System.out.println("Plane has speed " + miles + " miles/hour");
    }
}
