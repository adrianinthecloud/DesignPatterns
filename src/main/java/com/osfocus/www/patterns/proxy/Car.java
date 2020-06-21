package com.osfocus.www.patterns.proxy;

import java.util.concurrent.TimeUnit;

public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("In car.move() method");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print(int miles) {
        System.out.println("Car has speed " + miles + " miles/hour");
    }
}
