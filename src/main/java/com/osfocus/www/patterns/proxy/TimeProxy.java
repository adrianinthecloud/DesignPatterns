package com.osfocus.www.patterns.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeProxy implements Movable {
    Movable target;

    public TimeProxy(Movable target) {
        this.target = target;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        target.move();
        long endTime = System.currentTimeMillis();
        System.out.println(target.getClass().getName() + " move() took " + (endTime-startTime) + "ms");
    }

    @Override
    public void print(int miles) {

    }
}
