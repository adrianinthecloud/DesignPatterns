package com.osfocus.www.patterns.observer;

public class Main {
    public static void main(String args[]) {
        Publiser publiser = new Publiser();
        MyObserver observer1 = new MyObserver("Observer-1");
        MyObserver observer2 = new MyObserver("Observer-2");

        publiser.add(observer1);
        publiser.add(observer2);
        publiser.publish(new MessageEvent());
    }
}
