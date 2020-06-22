package com.osfocus.www.patterns.state;

public class OpenState extends State {
    @Override
    State openTheDoor() {
        try {
            throw new IllegalAccessException("Cannot open the door when it is opened.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    State closeTheDoor() {
        System.out.println("Close the door");
        return new ClosedState();
    }

    @Override
    State run() {
        try {
            throw new IllegalAccessException("Cannot run the car before you close the door.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    State stop() {
        try {
            throw new IllegalAccessException("Cannot stop the car before you close the door.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return this;
    }
}
