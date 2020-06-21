package com.osfocus.www.patterns.proxy;

public class LogProxy implements Movable {
    Movable target;

    public LogProxy(Movable target) {
        this.target = target;
    }

    @Override
    public void move() {
        System.out.println("Start to log the usage of move");
        target.move();;
        System.out.println("End logging usage of move");
    }

    @Override
    public void print(int miles) {

    }
}
