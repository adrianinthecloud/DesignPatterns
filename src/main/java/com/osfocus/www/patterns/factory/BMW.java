package com.osfocus.www.patterns.factory;

public class BMW implements Movable {
    @Override
    public void move() {
        System.out.println("BMW M850i is moving");
    }
}
