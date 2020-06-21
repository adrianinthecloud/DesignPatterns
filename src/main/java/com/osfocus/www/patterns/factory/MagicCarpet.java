package com.osfocus.www.patterns.factory;

public class MagicCarpet implements Movable {
    @Override
    public void move() {
        System.out.println("Magic Carpet is moving");
    }
}
