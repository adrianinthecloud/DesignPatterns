package com.osfocus.www.patterns.adapter;

public class EuropeanCircularSocket extends CircularSocket {
    @Override
    public void providePower() {
        System.out.println("European Circular Socket is providing power.");
    }
}
