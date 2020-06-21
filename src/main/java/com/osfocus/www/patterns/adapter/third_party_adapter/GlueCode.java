package com.osfocus.www.patterns.adapter.third_party_adapter;

import java.util.Iterator;

public class GlueCode<E> implements Iterator<E> {
    private E[] array;
    private int index = 0;

    public GlueCode(E[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public E next() {
        return array[index++];
    }
}
