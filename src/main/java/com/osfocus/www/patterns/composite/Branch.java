package com.osfocus.www.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Node {
    private List<Node> nodeList = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public void add(Node node) {
        nodeList.add(node);
    }

    @Override
    public void print(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("---");
        }
        System.out.println("This is branch-"+name);

        for (Node node : nodeList) {
            node.print(depth+1);
        }
    }
}
