package com.osfocus.www.patterns.command;

import java.util.ArrayList;

public class CommandTest {
    public static void main(String[] args) {
        ArrayList<Command> commandList = new ArrayList<>();
        Receiver r = new Receiver();
        commandList.add(new FileDownloadCommand(r));
        commandList.add(new DataUpdateCommand(r));
        Invoker invoker = new Invoker();

        for (Command c : commandList) {
            invoker.actionPerformed(c);
        }
    }
}
