package com.mayank.java.java8.streams.questions;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        // Q: Find the even number from ArrayList using Stream
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> even = list.stream().filter(element -> element % 2 == 0).toList();

        System.out.println("Input: " + list);
        System.out.println("Even: " + even);
    }
}
