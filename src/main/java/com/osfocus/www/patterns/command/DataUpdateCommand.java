package com.osfocus.www.patterns.command;

public class DataUpdateCommand extends Command {
    public DataUpdateCommand(Receiver r) {
        super(r);
    }

    @Override
    void execute() {
        receiver.dataUpdate();;
    }
}
