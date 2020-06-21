package com.osfocus.www.patterns.command;

public class Invoker {
    public void actionPerformed(Command command) {
        command.execute();
    }
}
