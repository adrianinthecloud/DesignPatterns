package com.osfocus.www.patterns.iterator;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        _ArrayList<Integer> myArrayList = new _ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        System.out.println("size = " + myArrayList.size());

        _Iterator it = myArrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
