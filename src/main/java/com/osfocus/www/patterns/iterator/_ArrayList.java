package com.osfocus.www.patterns.iterator;

import java.util.Arrays;

public class _ArrayList<T> implements _Collection<T> {
    private T[] array;
    private int size = 0;

    public _ArrayList(int capacity) {
        this.array = (T[]) new Object[capacity];
    }

    public _ArrayList() {
        this(0);
    }

    @Override
    public void add(Object item) {
        if (size == array.length) {
            if (size == 0) {
                array = (T[]) new Object[1];
            } else {
                T[] newArray = Arrays.copyOf(array, array.length*2);
                array = newArray;
            }
            array[size] = (T) item;
            size++;
        }
    }

    @Override
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator iterator() {
        return new Iterator();
    }

    private class Iterator<T> implements _Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            return (T) array[index++];
        }
    }
}
