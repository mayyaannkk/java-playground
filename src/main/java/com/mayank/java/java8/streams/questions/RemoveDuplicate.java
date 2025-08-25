package com.mayank.java.java8.streams.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "banana", "kiwi");

        // 1. Using Distinct
        List<String> distinct = list.stream()
                .distinct()
                .toList();
        System.out.println(distinct);

        // ORDER NOT PRESERVED WITH SET
        // 2. Using Set
        Set<String> set = list.stream()
                .collect(Collectors.toSet());
        System.out.println(set);

        // 3. Using HashSet
        HashSet<String> hashSet = new HashSet<>(list);
        System.out.println(hashSet);
    }
}
