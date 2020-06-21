package com.osfocus.www.patterns.command;

public abstract class Command {
    Receiver receiver = null;
    int state = 0;

    public Command(Receiver r) {
        this.receiver = r;
    }

    abstract void execute();
}
