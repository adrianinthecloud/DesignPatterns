package com.osfocus.www.patterns.adapter.thirdpartyadapter;

import java.util.Random;

public class ClientCode {
    private Integer[] array = new Integer[10];
    Random r = new Random();

    {
        for (int i = 0; i < 10; i++) {
            array[i] = r.nextInt(100);
        }
    }

    public void listItems() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public Integer[] getItems() {
        return array;
    }
}
