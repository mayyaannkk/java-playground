package com.mayank.java.java8.streams.questions;

import java.util.Arrays;
import java.util.List;

public class StartingWithOne {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 21, 13, 41, 15, 2, 1, 100);

        List<Integer> startsWith = list.stream()
                .filter(num -> String.valueOf(num).startsWith("1"))
                .toList();

        System.out.println(startsWith);
    }
}
