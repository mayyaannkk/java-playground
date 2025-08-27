package com.mayank.java.java8.streams.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntersection {
    public static void main(String[] args) {
        // Intersection = common elements
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

        List<Integer> intersection = list1.stream()
                .filter(ele -> list2.contains(ele))
                .toList();

        System.out.println(intersection);

        // list1.add(1); --> Gives error as list created with Arrays.asList cannot change in size
        List<Integer> intersectionList = new ArrayList<>(list1);
        intersectionList.retainAll(list2);
        System.out.println(intersectionList);

    }
}
