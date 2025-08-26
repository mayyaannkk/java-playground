package com.mayank.java.java8.streams.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdHighestLen {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "cherry", "mango");
        int n = 2;

        list.stream()
                .sorted((a,b) -> Integer.compare(b.length(), a.length()))
//                .sorted(Comparator.comparingInt(String::length).reversed())
                .skip(n-1)
                .findFirst().ifPresent(System.out::println);

    }
}
