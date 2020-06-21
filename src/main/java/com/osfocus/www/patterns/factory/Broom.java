package com.osfocus.www.patterns.factory;

public class Broom implements Movable {
    @Override
    public void move() {
        System.out.println("Broom is moving");
    }
}
