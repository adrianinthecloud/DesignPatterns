package com.osfocus.www.patterns.state;

public class Main {
    public static void main(String[] args) {
        OpenState openState = new OpenState();

        Car car = new Car(openState);
        car.closeTheDoor();
        car.run();
    }
}
