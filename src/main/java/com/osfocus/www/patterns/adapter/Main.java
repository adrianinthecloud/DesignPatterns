package com.osfocus.www.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        USRectanglarPlug usRectanglePlug = new USRectanglarPlug();
        RectanglarPlugAdapter adapter = new RectanglarPlugAdapter(usRectanglePlug);
        adapter.providePower();
    }
}
