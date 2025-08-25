package com.mayank.java.java8.streams.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JoinSortedList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(2, 6, 8, 9);

        List<Integer> sortedJoinedList = Stream.concat(list.stream(), list2.stream())
                .sorted()
                .toList();
        sortedJoinedList.forEach(System.out::println);
    }
}
