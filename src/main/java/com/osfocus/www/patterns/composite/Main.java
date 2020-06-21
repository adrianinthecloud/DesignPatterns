package com.osfocus.www.patterns.composite;

public class Main {
    public static void main(String args[]) {
        Branch root = new Branch("root");
        Branch b1 = new Branch("b1");
        Branch b2 = new Branch("b2");
        Leaf l1 = new Leaf("l1");
        Leaf l2 = new Leaf("l2");

        root.add(b1);
        root.add(b2);
        b1.add(l1);
        b1.add(l2);

        root.print(0);
    }
}
