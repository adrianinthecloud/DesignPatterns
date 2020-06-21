package com.osfocus.www.patterns.proxy;

public class Tester {
    public static void main(String args[]) {
        Car car = new Car();

        TimeProxy ppt = new TimeProxy(car);
        LogProxy logger = new LogProxy(ppt);
        logger.move();;
    }
}
