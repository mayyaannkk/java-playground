package com.mayank.java.java8.streams.questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountChar {
    public static void main(String[] args) {
        String input = "hello world";
        Map<String, Long> collect = Arrays.stream(input.split(""))
                .filter(ch -> !ch.isBlank())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((key, val) -> System.out.println("Char: " + key + " count: " + val));
    }
}
