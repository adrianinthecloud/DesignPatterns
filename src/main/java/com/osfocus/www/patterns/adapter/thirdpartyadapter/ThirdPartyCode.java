package com.osfocus.www.patterns.adapter.thirdpartyadapter;

import java.util.Iterator;

public class ThirdPartyCode<E> {
    public void listItems(Iterator<E> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
