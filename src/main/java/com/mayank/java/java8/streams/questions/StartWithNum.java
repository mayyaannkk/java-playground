package com.mayank.java.java8.streams.questions;

import java.util.Arrays;
import java.util.List;

public class StartWithNum {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1abc", "def", "3ghi", "jkl", "4mno", "pqw", "5rst");

        list.stream()
                .filter(str -> Character.isDigit(str.charAt(0)))
                .forEach(System.out::println);
    }
}
