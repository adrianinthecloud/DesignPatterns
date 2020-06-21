package com.osfocus.www.patterns.factory;

public class Mercedes implements Movable {
    @Override
    public void move() {
        System.out.println("Mercedes AMG GT is moving");
    }
}
