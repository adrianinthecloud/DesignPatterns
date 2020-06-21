package com.osfocus.www.patterns.command;

public class FileDownloadCommand extends Command {
    public FileDownloadCommand(Receiver r) {
        super(r);
    }

    @Override
    public void execute() {
        receiver.fileDownload();
    }
}
