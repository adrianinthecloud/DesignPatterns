package com.osfocus.www.patterns.observer;

public class MyObserver {
    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    public void onEvent(AbsEvent event) {
        System.out.println("Observer " + name + " is working on ");
        event.print();
    }
}
