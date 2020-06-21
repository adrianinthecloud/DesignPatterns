package com.osfocus.www.patterns.adapter;

public class USRectanglarPlug extends RectanglarPlug {
    @Override
    public void providePower() {
        System.out.println("US Rectangle Plug is providing power.");
    }
}
