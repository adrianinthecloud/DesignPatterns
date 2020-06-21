package com.osfocus.www.patterns.proxy;

public class TimeTester extends TestTarget {
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        super.run();
        long endTime = System.currentTimeMillis();
        System.out.println("method move() took " + (endTime-startTime) + "ms");
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        super.move();
        long endTime = System.currentTimeMillis();
        System.out.println("method move() took " + (endTime-startTime) + "ms");
    }
}
