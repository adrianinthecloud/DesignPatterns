package com.osfocus.www.patterns.composite;

public class Leaf extends Node {
    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void print(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("---");
        }
        System.out.println("this is leaf-"+name);
    }
}
