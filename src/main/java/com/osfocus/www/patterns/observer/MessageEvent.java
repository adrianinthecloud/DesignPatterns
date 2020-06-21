package com.osfocus.www.patterns.observer;

public class MessageEvent extends AbsEvent {

    @Override
    void print() {
        System.out.println("Sending message");
    }
}
