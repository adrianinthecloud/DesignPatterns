package com.osfocus.www.patterns.state;

public abstract class State {
    abstract State openTheDoor();
    abstract State closeTheDoor();
    abstract State run();
    abstract State stop();
}
