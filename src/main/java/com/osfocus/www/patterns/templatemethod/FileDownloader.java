package com.osfocus.www.patterns.templatemethod;

public class FileDownloader {
    private String source;

    public FileDownloader(String source) {
        this.source = source;
    }

    public void download() {
        getFiles();
        verifyDownloadCompleteness();
    }

    public void getFiles() {
        System.out.println("Getting files from " + source);
    }

    public void verifyDownloadCompleteness() {
        System.out.println("Verifying completeness of recent file download");
    }
}
