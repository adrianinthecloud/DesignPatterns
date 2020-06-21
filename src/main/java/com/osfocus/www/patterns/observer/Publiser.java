package com.osfocus.www.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publiser {
    List<MyObserver> observerList = new ArrayList<>();

    public void add(MyObserver observer) {
        observerList.add(observer);
    };

    public void publish(AbsEvent event) {
        for (MyObserver observer : observerList) {
            observer.onEvent(event);
        }
    }
}
