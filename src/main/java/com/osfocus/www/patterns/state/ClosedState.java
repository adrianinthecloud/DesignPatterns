package com.osfocus.www.patterns.state;

public class ClosedState extends State {
    @Override
    State openTheDoor() {
        System.out.println("Open the door");
        return new OpenState();
    }

    @Override
    State closeTheDoor() {
        try {
            throw new IllegalAccessException("Cannot close the door when it is closed.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    State run() {
        System.out.println("Start running the car");
        return new RunningState();
    }

    @Override
    State stop() {
        try {
            throw new IllegalAccessException("Cannot stop the car when it is not running.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return this;
    }
}
