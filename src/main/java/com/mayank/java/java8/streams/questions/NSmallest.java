package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetElementsAs;

import java.util.List;

public class NSmallest {
    public static void main(String[] args) {
        List<Integer> list = GetElementsAs.getList();
        int nth = 3;

        System.out.println(list);
        list.stream()
                .filter(num -> num > 0)
                .sorted()
//                .peek(System.out::println)
                .distinct()
                .skip(nth - 1)
                .findFirst().ifPresent(System.out::println);
    }
}
