package com.osfocus.www.patterns.adapter;

public class RectanglarPlugAdapter extends CircularSocket {
    private RectanglarPlug rectangleSocket;

    public RectanglarPlugAdapter(RectanglarPlug rectangleSocket) {
        this.rectangleSocket = rectangleSocket;
    }

    @Override
    public void providePower() {
        System.out.println("Circular socket is providing power using RectangleSocketAdapter");
        rectangleSocket.providePower();
    }
}
