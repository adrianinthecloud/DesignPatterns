package com.osfocus.www.patterns.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Integer intArr[] = new Integer[]{3,7,1,9,22};
        Sorter<Integer> intSorter = new Sorter<>();
        intSorter.sort(intArr, (o1, o2)->{
            if (o1 < o2) return -1;
            if (o1 == o2) return 0;
            return 1;
        });

        Arrays.stream(intArr).forEach(System.out::println);

        Cat[] catArr = new Cat[]{new Cat(11), new Cat(2), new Cat(6)};
        Sorter<Cat> catSorter = new Sorter<>();
        catSorter.sort(catArr, new CatComparator());

        Arrays.stream(catArr).forEach(System.out::println);

        Dog[] dogArr = new Dog[]{new Dog(99), new Dog(12), new Dog(101)};
        Sorter<Dog> dogSorter = new Sorter<>();
        dogSorter.sort(dogArr, (o1, o2) -> o1.compareTo(o2));

        Arrays.stream(dogArr).forEach(System.out::println);
    }
}
