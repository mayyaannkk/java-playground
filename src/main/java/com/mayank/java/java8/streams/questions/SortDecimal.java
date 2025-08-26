package com.mayank.java.java8.streams.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDecimal {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(1.3, 3.4, 2.2, 5.5, 4.3, 5.5);

        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
