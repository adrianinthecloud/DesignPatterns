package com.osfocus.www.patterns.strategy;

public class Cat implements Comparable<Cat> {
    int weight;

    public Cat(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat o) {
        if (this.weight < o.weight) return -1;
        if (this.weight == o.weight) return 0;
        return 1;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }
}
