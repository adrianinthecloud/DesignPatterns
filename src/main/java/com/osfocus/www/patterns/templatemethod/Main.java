package com.osfocus.www.patterns.templatemethod;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileDownloader downloader = new FileDownloader("http://www.osfocus.com");
        downloader.getFiles();
        downloader.verifyDownloadCompleteness();
    }
}
