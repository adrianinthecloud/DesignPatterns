package com.osfocus.www.patterns.strategy;

import java.util.Comparator;

public class Dog implements Comparable<Dog> {
    int power;

    public Dog(int power) {
        this.power = power;
    }

    @Override
    public int compareTo(Dog o) {
        if (power < o.power) return -1;
        if (power == o.power) return 0;
        return 1;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "power=" + power +
                '}';
    }
}
