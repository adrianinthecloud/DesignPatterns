package com.osfocus.www.patterns.state;

public class RunningState extends State {
    @Override
    State openTheDoor() {
        try {
            throw new IllegalAccessException("Cannot open the door when it is running.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    State closeTheDoor() {
        try {
            throw new IllegalAccessException("Cannot close the door when it is running.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    State run() {
        try {
            throw new IllegalAccessException("Cannot run the car when it is running.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    State stop() {
        System.out.println("Stop the car.");
        return new StopState();
    }
}
