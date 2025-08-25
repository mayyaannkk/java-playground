package com.mayank.java.java8.streams.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JoinStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 8, 5, 9);

        Stream<Integer> stream = Stream.concat(list.stream(), list2.stream());
        stream.forEach(System.out::println);
    }
}
