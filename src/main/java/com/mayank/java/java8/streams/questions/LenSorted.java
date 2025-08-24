package com.mayank.java.java8.streams.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LenSorted {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "AA", "AAA", "AAAA", "B", "BB", "BBB", "BBBB");
        System.out.println("Original: " + list);

        Comparator<String> c = (a, b) -> {
            int len1 = a.length();
            int len2 = b.length();
            return Integer.compare(len1, len2);
        };

        List<String> sorted = list.stream()
                .sorted(c)
                .toList();
        System.out.println("Sorted acc to length: " + sorted);
        String sortedMax = list.stream()
                .max(c).get();
        System.out.println("Sorted len max: " + sortedMax);

        List<String> dicSort = list.stream()
                .sorted()
                .toList();
        System.out.println("Dictionary sorted: " + dicSort);

        Comparator<String> c2 = (a, b) -> {
            int len1 = a.length();
            int len2 = b.length();
            return Integer.compare(len2, len1);
        };
        List<String> revLenSort = list.stream()
                .sorted(c2)
                .toList();
        System.out.println("Reverse Length Sorted: " + revLenSort);

        String revLenMin = list.stream()
                .min(c2).get();
        System.out.println("Rev len sorted max: " + revLenMin);
    }
}
