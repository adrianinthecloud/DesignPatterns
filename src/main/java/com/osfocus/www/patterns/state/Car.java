package com.osfocus.www.patterns.state;

public class Car {
    State state;

    public Car(State state) {
        this.state = state;
    }

    public void openTheDoor() {
        state = state.openTheDoor();
    }

    public void closeTheDoor() {
        state = state.closeTheDoor();
    }

    public void run() {
        state = state.run();
    }

    public void stop() {
        state = state.stop();
    }
}
