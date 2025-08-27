package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetData;

import java.util.List;

public class FindFirstOdd {
    public static void main(String[] args) {
        List<Integer> list = GetData.getIntegerList();
        System.out.println(list);

        list.stream()
                .filter(ele -> ele % 2 != 0)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
