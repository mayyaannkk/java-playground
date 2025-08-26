package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetData;

import java.util.List;

public class MulFirstTwo {
    public static void main(String[] args) {
        List<Integer> list = GetData.getList();
        System.out.println(list);

        list.stream()
                .limit(2)
                .reduce((a, b) -> a * b)
                .ifPresent(System.out::println);
    }
}
